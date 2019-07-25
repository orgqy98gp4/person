package com.aaa.service;

import com.aaa.entity.Area_Info;

import java.util.List;

/**
 * @Local com.aaa.service
 * @Author ZongKeLi
 * @Date 2019/06/22  15:46
 * @Version 1.0
 */
public interface Area_infoService {
    int deleteByPrimaryKey(Integer areaId);

    int insert(Area_Info record);

    int insertSelective(Area_Info record);

    Area_Info selectByPrimaryKey(Integer areaId);

    List<Area_Info> queryAll();

    int updateByPrimaryKeySelective(Area_Info record);

    int updateByPrimaryKey(Area_Info record);
}
