package com.aaa.service;

import com.aaa.dao.Person_InfoMapper;
import com.aaa.entity.Person_Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Local com.aaa.service
 * @Author ZongKeLi
 * @Date 2019/06/22  10:40
 * @Version 1.0
 */
@Service
public class Person_InforServiceImpl implements Person_InforService {
    @Autowired
    private Person_InfoMapper mapper;
    @Override
    public int deleteByPrimaryKey(Integer personId) {
        return mapper.deleteByPrimaryKey(personId);
    }

    @Override
    public int insert(Person_Info record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Person_Info record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Person_Info selectByPrimaryKey(Integer personId) {
        return mapper.selectByPrimaryKey(personId);
    }

    @Override
    public List<Person_Info> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public int updateByPrimaryKeySelective(Person_Info record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Person_Info record) {
        return mapper.updateByPrimaryKey(record);
    }
}
