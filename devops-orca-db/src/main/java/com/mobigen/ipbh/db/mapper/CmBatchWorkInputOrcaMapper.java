package com.mobigen.ipbh.db.mapper;

import com.mobigen.ipbh.db.model.CmBatchWorkInputOrca;
import com.mobigen.ipbh.db.model.CmBatchWorkInputOrcaExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CmBatchWorkInputOrcaMapper {
    long countByExample(CmBatchWorkInputOrcaExample example);

    int deleteByExample(CmBatchWorkInputOrcaExample example);

    int insert(CmBatchWorkInputOrca record);

    int insertSelective(CmBatchWorkInputOrca record);

    List<CmBatchWorkInputOrca> selectByExample(CmBatchWorkInputOrcaExample example);

    int updateByExampleSelective(@Param("record") CmBatchWorkInputOrca record, @Param("example") CmBatchWorkInputOrcaExample example);

    int updateByExample(@Param("record") CmBatchWorkInputOrca record, @Param("example") CmBatchWorkInputOrcaExample example);
}