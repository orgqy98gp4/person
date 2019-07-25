package com.aaa.dao;

import com.aaa.entity.Area_Info;

import java.util.List;

public interface Area_InfoMapper {
    int deleteByPrimaryKey(Integer areaId);

    int insert(Area_Info record);

    int insertSelective(Area_Info record);

    Area_Info selectByPrimaryKey(Integer areaId);

    List<Area_Info> queryAll();

    int updateByPrimaryKeySelective(Area_Info record);

    int updateByPrimaryKey(Area_Info record);
}