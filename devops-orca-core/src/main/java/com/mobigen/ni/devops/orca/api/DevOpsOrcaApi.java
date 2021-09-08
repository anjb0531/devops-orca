package com.mobigen.ni.devops.orca.api;

import com.mobigen.ni.devops.orca.domain.common.ResponseCommon;
import com.mobigen.ni.devops.orca.domain.wrapper.RequestOrcaWRCancel;
import com.mobigen.ni.devops.orca.domain.wrapper.RequestOrcaWRExec;
import com.mobigen.ni.devops.orca.domain.wrapper.RequestOrcaWRResult;
import com.mobigen.ni.devops.orca.domain.wrapper.RequestOrcaWRRowResult;
import com.mobigen.ni.devops.orca.service.OrcaService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("cm/batch/v1/orca")
public class DevOpsOrcaApi {

    private final OrcaService orcaService;

    public DevOpsOrcaApi(OrcaService orcaService) {
        this.orcaService = orcaService;
    }

    @ApiOperation(value = "Python Code 실행을 수행한다", notes = "execute python code")
    @PostMapping("/exec")
    public ResponseCommon exec(@RequestBody RequestOrcaWRExec req) {
        log.info("#MethodName:{}, RequestBody:{}"
                , Thread.currentThread().getStackTrace()[1].getMethodName(), req.toString());
        ResponseCommon res = orcaService.exec(req.getInput());
        log.info("#ResponseCommon:{}", res.toString());
        return res;
    }

    @ApiOperation(value = "Python Code 실행을 중단을 시킨다", notes = "stop python code")
    @PostMapping("/cancel")
    public ResponseCommon cancel(@RequestBody RequestOrcaWRCancel req) {
        log.info("#MethodName:{}, RequestBody:{}"
                , Thread.currentThread().getStackTrace()[1].getMethodName(), req.toString());
        ResponseCommon res = orcaService.cancel(req.getInput());
        log.info("#ResponseCommon:{}", res.toString());
        return res;
    }

    @ApiOperation(value = "Python Code 수행 최종 결과를 수신한다.", notes = "get python result")
    @PostMapping("/result")
    public ResponseCommon result(@RequestBody RequestOrcaWRResult req) {
        log.info("#MethodName:{}, RequestBody:{}"
                , Thread.currentThread().getStackTrace()[1].getMethodName(), req.toString());

        ResponseCommon res = orcaService.result(req.getInput());
        log.info("#ResponseCommon:{}", res.toString());
        return res;
    }

    @ApiOperation(value = "Python Code 수행 결과를 행 기준으로 수신한다", notes = "get python row result")
    @PostMapping("/rowresult")
    public ResponseCommon rowResult(@RequestBody RequestOrcaWRRowResult req) {
        log.info("#MethodName:{}, RequestBody:{}"
                , Thread.currentThread().getStackTrace()[1].getMethodName(), req.toString());
        ResponseCommon res = orcaService.rowResult(req.getInput());
        log.info("#ResponseCommon:{}", res.toString());
        return res;
    }

}
