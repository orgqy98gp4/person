package com.aaa.service;

import com.aaa.dao.Area_InfoMapper;
import com.aaa.entity.Area_Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Local com.aaa.service
 * @Author ZongKeLi
 * @Date 2019/06/22  15:46
 * @Version 1.0
 */
@Service
public class AreaInfoServiceImpl implements Area_infoService {
    @Autowired
    private Area_InfoMapper mapper;
    @Override
    public int deleteByPrimaryKey(Integer areaId) {
        return 0;
    }

    @Override
    public int insert(Area_Info record) {
        return 0;
    }

    @Override
    public int insertSelective(Area_Info record) {
        return 0;
    }

    @Override
    public Area_Info selectByPrimaryKey(Integer areaId) {
        return mapper.selectByPrimaryKey(areaId);
    }

    @Override
    public List<Area_Info> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public int updateByPrimaryKeySelective(Area_Info record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Area_Info record) {
        return 0;
    }
}
