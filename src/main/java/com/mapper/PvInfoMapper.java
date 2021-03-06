package com.mapper;

import com.pojo.PvInfo;
import com.pojo.PvInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PvInfoMapper {
    long countByExample(PvInfoExample example);

    int deleteByExample(PvInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PvInfo record);

    int insertSelective(PvInfo record);

    List<PvInfo> selectByExample(PvInfoExample example);

    PvInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PvInfo record, @Param("example") PvInfoExample example);

    int updateByExample(@Param("record") PvInfo record, @Param("example") PvInfoExample example);

    int updateByPrimaryKeySelective(PvInfo record);

    int updateByPrimaryKey(PvInfo record);
}