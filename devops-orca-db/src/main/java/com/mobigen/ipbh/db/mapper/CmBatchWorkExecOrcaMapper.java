package com.mobigen.ipbh.db.mapper;

import com.mobigen.ipbh.db.model.CmBatchWorkExecOrca;
import com.mobigen.ipbh.db.model.CmBatchWorkExecOrcaExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CmBatchWorkExecOrcaMapper {
    long countByExample(CmBatchWorkExecOrcaExample example);

    int deleteByExample(CmBatchWorkExecOrcaExample example);

    int insert(CmBatchWorkExecOrca record);

    int insertSelective(CmBatchWorkExecOrca record);

    List<CmBatchWorkExecOrca> selectByExample(CmBatchWorkExecOrcaExample example);

    int updateByExampleSelective(@Param("record") CmBatchWorkExecOrca record, @Param("example") CmBatchWorkExecOrcaExample example);

    int updateByExample(@Param("record") CmBatchWorkExecOrca record, @Param("example") CmBatchWorkExecOrcaExample example);
}