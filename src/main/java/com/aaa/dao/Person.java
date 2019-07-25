package com.aaa.dao;

import com.aaa.entity.Person_Info;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Local com.aaa.dao
 * @Author ZongKeLi
 * @Date 2019/06/23  14:27
 * @Version 1.0
 */
public interface Person {
    @Select("select p.*,a.area_name areaName from person_info p join area_info a on p.person_area_id=a.area_id")
    List<Person_Info> queryAll();
    @Select("select * from person_info where person_id=?")
    Person_Info query(Integer id);
    int update(Person_Info info);
    int delete(Integer id);
    int add(Person_Info info);
}
