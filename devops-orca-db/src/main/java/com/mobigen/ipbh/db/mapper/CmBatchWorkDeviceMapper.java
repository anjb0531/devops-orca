package com.mobigen.ipbh.db.mapper;

import com.mobigen.ipbh.db.model.CmBatchWorkDevice;
import com.mobigen.ipbh.db.model.CmBatchWorkDeviceExample;
import com.mobigen.ipbh.db.model.CmBatchWorkDeviceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmBatchWorkDeviceMapper {
    long countByExample(CmBatchWorkDeviceExample example);

    int deleteByExample(CmBatchWorkDeviceExample example);

    int deleteByPrimaryKey(CmBatchWorkDeviceKey key);

    int insert(CmBatchWorkDevice record);

    int insertSelective(CmBatchWorkDevice record);

    List<CmBatchWorkDevice> selectByExample(CmBatchWorkDeviceExample example);

    CmBatchWorkDevice selectByPrimaryKey(CmBatchWorkDeviceKey key);

    int updateByExampleSelective(@Param("record") CmBatchWorkDevice record, @Param("example") CmBatchWorkDeviceExample example);

    int updateByExample(@Param("record") CmBatchWorkDevice record, @Param("example") CmBatchWorkDeviceExample example);

    int updateByPrimaryKeySelective(CmBatchWorkDevice record);

    int updateByPrimaryKey(CmBatchWorkDevice record);
}