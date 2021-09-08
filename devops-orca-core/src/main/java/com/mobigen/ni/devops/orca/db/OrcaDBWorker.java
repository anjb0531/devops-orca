package com.mobigen.ni.devops.orca.db;

import com.mobigen.ipbh.db.mapper.CmBatchWorkDeviceMapper;
import com.mobigen.ipbh.db.mapper.CmBatchWorkExecOrcaMapper;
import com.mobigen.ipbh.db.mapper.CmBatchWorkInputOrcaMapper;
import com.mobigen.ipbh.db.model.*;
import com.mobigen.ni.devops.orca.domain.request.model.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
@Component
public class OrcaDBWorker {
    private final CmBatchWorkExecOrcaMapper cmBatchWorkExecOrcaMapper;
    private final CmBatchWorkInputOrcaMapper cmBatchWorkInputOrcaMapper;
    private final CmBatchWorkDeviceMapper cmBatchWorkDeviceMapper;

    public OrcaDBWorker (CmBatchWorkExecOrcaMapper cmBatchWorkExecOrcaMapper,
                         CmBatchWorkInputOrcaMapper cmBatchWorkInputOrcaMapper,
                         CmBatchWorkDeviceMapper cmBatchWorkDeviceMapper) {
        this.cmBatchWorkExecOrcaMapper = cmBatchWorkExecOrcaMapper;
        this.cmBatchWorkInputOrcaMapper = cmBatchWorkInputOrcaMapper;
        this.cmBatchWorkDeviceMapper = cmBatchWorkDeviceMapper;
    }

    public List<CmBatchWorkInputOrca> getInputList(String workId) {
        CmBatchWorkInputOrcaExample example = new CmBatchWorkInputOrcaExample();
        example.createCriteria().andWorkIdEqualTo(workId);

        return cmBatchWorkInputOrcaMapper.selectByExample(example);
    }


    public List<CmBatchWorkExecOrca> getExecList(String workId) {
        CmBatchWorkExecOrcaExample example = new CmBatchWorkExecOrcaExample();
        example.createCriteria().andWorkIdEqualTo(workId);

        return cmBatchWorkExecOrcaMapper.selectByExample(example);
    }

    public Set<Integer> getExecSequenceSet(String workId) {
        List<CmBatchWorkExecOrca> execList = getExecList(workId);
        Set<Integer> sequenceSet = new HashSet<>();
        for(CmBatchWorkExecOrca exec:execList) {
            sequenceSet.add(exec.getSequence());
        }
        return sequenceSet;
    }

    public String getHostnames(String workId, Integer sequence) {
        CmBatchWorkInputOrcaExample example = new CmBatchWorkInputOrcaExample();
        example.createCriteria().andWorkIdEqualTo(workId).andSequenceEqualTo(sequence);

        List<CmBatchWorkInputOrca> inputList = cmBatchWorkInputOrcaMapper.selectByExample(example);

        if(inputList.size() == 1) {
            return inputList.get(0).getHostnames();
        } else if(inputList.size() == 0) {
            log.warn("[workId={},sequence={}] not found cm_batch_work_input_orca record", workId, sequence);
        } else {
            log.warn("[workId={},sequence={}] found {} records", workId, sequence, inputList.size());
        }

        return null;
    }

    @Transactional
    public int insertExecRecord(String workId, ResultData result) {
        int cnt = 0;

        CmBatchWorkExecOrca record = new CmBatchWorkExecOrca();
        record.setWorkId(workId);
        record.setMessage(result.getResultMessage());
        record.setBody(result.getResultBody());
        record.setSequence(result.getSequence());
        record.setPass(result.getResultCode()==0?true:false);

        cnt = cmBatchWorkExecOrcaMapper.insertSelective(record);

        return cnt;
    }


    @Transactional
    public int setDeviceCfgChanged(String workId, String hostname) {
        int cnt = 0;

        CmBatchWorkDeviceKey key = new CmBatchWorkDeviceKey();
        key.setWorkId(workId);
        key.setHostname(hostname);

        CmBatchWorkDevice device = cmBatchWorkDeviceMapper.selectByPrimaryKey(key);
        if (device != null) {
            device.setCfgChanged(true);
            cnt = cmBatchWorkDeviceMapper.updateByPrimaryKeySelective(device);
        } else {
            log.warn("[{},{}] not found cm_batch_work_device record", workId, hostname);
        }

        return cnt;
    }

}
