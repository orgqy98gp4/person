package com.aaa.dao;

import com.aaa.entity.Person_Info;

import java.util.List;

public interface Person_InfoMapper {
    int deleteByPrimaryKey(Integer personId);

    int insert(Person_Info record);

    int insertSelective(Person_Info record);

    Person_Info selectByPrimaryKey(Integer personId);

    List<Person_Info> queryAll();

    int updateByPrimaryKeySelective(Person_Info record);

    int updateByPrimaryKey(Person_Info record);
}