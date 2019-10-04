package com.zfy.mapper;

import com.zfy.pojo.Flower;
import com.zfy.pojo.FlowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlowerMapper {
    long countByExample(FlowerExample example);

    int deleteByExample(FlowerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Flower record);

    int insertSelective(Flower record);

    List<Flower> selectByExample(FlowerExample example);

    Flower selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Flower record, @Param("example") FlowerExample example);

    int updateByExample(@Param("record") Flower record, @Param("example") FlowerExample example);

    int updateByPrimaryKeySelective(Flower record);

    int updateByPrimaryKey(Flower record);
}