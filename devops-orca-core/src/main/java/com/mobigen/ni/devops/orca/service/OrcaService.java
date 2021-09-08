package com.mobigen.ni.devops.orca.service;

import com.mobigen.ipbh.db.model.CmBatchWorkExecOrca;
import com.mobigen.ipbh.db.model.CmBatchWorkInputOrca;
import com.mobigen.ni.devops.orca.common.Constants;
import com.mobigen.ni.devops.orca.db.OrcaDBWorker;
import com.mobigen.ni.devops.orca.domain.common.CommonOutput;
import com.mobigen.ni.devops.orca.domain.common.ResponseCommon;
import com.mobigen.ni.devops.orca.domain.request.RequestOrcaCancel;
import com.mobigen.ni.devops.orca.domain.request.RequestOrcaExec;
import com.mobigen.ni.devops.orca.domain.request.RequestOrcaResult;
import com.mobigen.ni.devops.orca.domain.request.RequestOrcaRowResult;
import com.mobigen.ni.devops.orca.domain.request.model.ResultData;
import lombok.extern.slf4j.Slf4j;
import net.logstash.logback.encoder.org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.xml.transform.Result;
import java.util.List;
import java.util.Set;

@Slf4j
@Service
public class OrcaService {
    private OrcaDBWorker orcaDBWorker;

    public OrcaService(OrcaDBWorker orcaDBWorker) {
        this.orcaDBWorker = orcaDBWorker;
    }

    public ResponseCommon exec(RequestOrcaExec input) {
        log.info("#MethodName:{} RequestBody:{}"
                , Thread.currentThread().getStackTrace()[1].getMethodName(), input.toString());
        CommonOutput output = CommonOutput.builder().build();

        //input validation
        output = checkInputExec(input);

        if(output.getCode() == Constants.SUCCESS_CODE) {
            //execute python code
        }

        return ResponseCommon.builder().output(output).build();
    }

    public ResponseCommon cancel(RequestOrcaCancel input) {
        log.info("#MethodName:{} RequestBody:{}"
                , Thread.currentThread().getStackTrace()[1].getMethodName(), input.toString());
        CommonOutput output = CommonOutput.builder().build();

        output = checkInputCancel(input);

        if(output.getCode() == Constants.SUCCESS_CODE) {
            //kill python code
        }

        return ResponseCommon.builder().output(output).build();
    }

    public ResponseCommon result(RequestOrcaResult input) {
        log.info("#MethodName:{} RequestBody:{}"
                , Thread.currentThread().getStackTrace()[1].getMethodName(), input.toString());
        CommonOutput output = CommonOutput.builder().build();

        output = checkInputResult(input);

        if(output.getCode() == Constants.SUCCESS_CODE) {
            int cnt = 0;

            String workId = input.getWorkId();
            List<CmBatchWorkInputOrca> inputList = orcaDBWorker.getInputList(workId);
            Set<Integer> execSequenceSet = orcaDBWorker.getExecSequenceSet(workId);

            for(CmBatchWorkInputOrca inputOrca:inputList) {
                if(!execSequenceSet.contains(inputOrca.getSequence())){
                    ResultData result = new ResultData();
                    result.setSequence(inputOrca.getSequence());
                    result.setResultCode(-1);
                    result.setResultMessage("결과 미수신");
                    result.setIsAffectedEquip(false);

                    cnt += orcaDBWorker.insertExecRecord(workId, result);
                }
            }
            if(cnt > 0)
                log.info("[{}]: inserted {} rows in cm_batch_work_exec_orca", input.getWorkId(), cnt);
            log.info("[]: finished python code", workId);
        }

        return ResponseCommon.builder().output(output).build();
    }

    public ResponseCommon rowResult(RequestOrcaRowResult input) {
        log.info("#MethodName:{} RequestBody:{}"
                , Thread.currentThread().getStackTrace()[1].getMethodName(), input.toString());
        CommonOutput output = CommonOutput.builder().build();

        output = checkInputRowResult(input);

        if(output.getCode() == Constants.SUCCESS_CODE) {
            String workId = input.getWorkId();
            List<ResultData> resultList = input.getResultData();
            int cnt = 0;

            for(ResultData result:resultList) {
                cnt += orcaDBWorker.insertExecRecord(workId, result);
                if(result.getIsAffectedEquip()) {
                    String hostnames = orcaDBWorker.getHostnames(workId, result.getSequence());
                    if(hostnames!=null) {
                        for(String hostname:hostnames.split(",")) {
                            int success = orcaDBWorker.setDeviceCfgChanged(workId, hostname);
                            if(success < 1) {
                                log.warn("[{},{}] failed setting device cfg_changed");
                            }
                        }
                    }
                }
            }
            log.info("[{}]: inserted {}/{} rows in cm_batch_work_exec_orca", input.getWorkId(), cnt, input.getResultData().size());
            if(cnt == input.getResultData().size())
                output = CommonOutput.builder().code(0).message("OK").build();
            else
                output = CommonOutput.builder().code(-2).message("failed insert all records ("+cnt+"/"+input.getResultData().size()+")").build();
        }

        return ResponseCommon.builder().output(output).build();
    }

    private CommonOutput checkInputExec(RequestOrcaExec input) {
        CommonOutput output = CommonOutput.builder().code(0).message("OK").build();

        do {
            // work-id check
            if (input.getWorkId() == null || input.getWorkId().length() < 1) {
                output = CommonOutput.builder().code(-1).message("work-id 누락").build();
                break;
            }
            // user-id check
            if (input.getUserId() == null || input.getUserId().length() < 1) {
                output = CommonOutput.builder().code(-1).message("user-id 누락").build();
                break;
            }
            // exec-process check
            if (input.getExecProcess() != null && !input.getExecProcess().endsWith(".py")) {
                output = CommonOutput.builder().code(-1).message("python 파일이 아님").build();
                break;
            }
            
            // exec-param check
            if (input.getExecParam() != null && !input.getExecParam().endsWith(".xlsx")) {
                output = CommonOutput.builder().code(-1).message("Excel 파일이 아님").build();
                break;
            }

        } while (false);

        return output;

    }

    private CommonOutput checkInputCancel(RequestOrcaCancel input) {
        CommonOutput output = CommonOutput.builder().code(0).message("OK").build();

        do {
            // work-id check
            if (input.getWorkId() == null || input.getWorkId().length() < 1) {
                output = CommonOutput.builder().code(-1).message("work-id 누락").build();
                break;
            }
            // user-id check
            if (input.getUserId() == null || input.getUserId().length() < 1) {
                output = CommonOutput.builder().code(-1).message("user-id 누락").build();
                break;
            }
            // exec-process check
            if (input.getExecProcess() != null && !input.getExecProcess().endsWith(".py")) {
                output = CommonOutput.builder().code(-1).message("python 파일이 아님").build();
                break;
            }

            // exec-param check
            if (input.getExecParam() != null && !input.getExecParam().endsWith(".xlsx")) {
                output = CommonOutput.builder().code(-1).message("Excel 파일이 아님").build();
                break;
            }

        } while (false);

        return output;

    }

    private CommonOutput checkInputResult(RequestOrcaResult input) {
        CommonOutput output = CommonOutput.builder().code(0).message("OK").build();

        do {
            // work-id check
            if (input.getWorkId() == null || input.getWorkId().length() < 1) {
                output = CommonOutput.builder().code(-1).message("work-id 누락").build();
                break;
            }
            // result-code check
            if (input.getResultCode() == null) {
                output = CommonOutput.builder().code(-1).message("result-code 누락").build();
                break;
            }
            // result-message check
            if (input.getResultMessage() == null) {
                output = CommonOutput.builder().code(-1).message("result-message 누락").build();
                break;
            }

        } while (false);

        return output;
    }

    private CommonOutput checkInputRowResult(RequestOrcaRowResult input) {
        CommonOutput output = CommonOutput.builder().code(0).message("OK").build();

        do {
            // work-id check
            if (input.getWorkId() == null || input.getWorkId().length() < 1) {
                output = CommonOutput.builder().code(-1).message("work-id 누락").build();
                break;
            }
            // user-id check
            if (input.getResultData() == null || input.getResultData().size() < 1) {
                output = CommonOutput.builder().code(-1).message("user-id 누락").build();
                break;
            }

            List<ResultData> resultData = input.getResultData();

            boolean check = false;
            for(ResultData row:resultData) {

                // sequence check
                if (row.getSequence() == null) {
                    output = CommonOutput.builder().code(-1).message("sequence 누락").build();
                    check = true;
                    break;
                }

                // is-affected-equip check
                if (row.getIsAffectedEquip() == null) {
                    output = CommonOutput.builder().code(-1).message("is-affected-equip 누락").build();
                    check = true;
                    break;
                }

                // result-code check
                if (row.getResultCode() == null) {
                    output = CommonOutput.builder().code(-1).message("result-code 누락").build();
                    check = true;
                    break;
                }

                // result-message check
                if (row.getResultMessage() == null) {
                    output = CommonOutput.builder().code(-1).message("result-message 누락").build();
                    check = true;
                    break;
                }

                // result-body check
                if (row.getResultBody() == null) {
                    output = CommonOutput.builder().code(-1).message("result-body 누락").build();
                    check = true;
                    break;
                }

            }

            if(check) break;

        } while (false);

        return output;
    }
}
