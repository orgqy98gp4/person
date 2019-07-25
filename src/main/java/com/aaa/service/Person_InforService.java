package com.aaa.service;

import com.aaa.entity.Person_Info;

import java.util.List;

/**
 * @Local com.aaa.service
 * @Author ZongKeLi
 * @Date 2019/06/22  08:32
 * @Version 1.0
 */
public interface Person_InforService {
    int deleteByPrimaryKey(Integer personId);

    int insert(Person_Info record);

    int insertSelective(Person_Info record);

    Person_Info selectByPrimaryKey(Integer personId);

    List<Person_Info> queryAll();

    int updateByPrimaryKeySelective(Person_Info record);

    int updateByPrimaryKey(Person_Info record);
}
