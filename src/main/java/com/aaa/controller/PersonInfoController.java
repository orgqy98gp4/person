package com.aaa.controller;

import com.aaa.entity.Area_Info;
import com.aaa.entity.Person_Info;
import com.aaa.service.Area_infoService;
import com.aaa.service.Person_InforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Local com.aaa.controller
 * @Author ZongKeLi
 * @Date 2019/06/22  08:31
 * @Version 1.0
 */
@Controller
@RequestMapping("/person")
public class PersonInfoController {
    @Autowired
    private Person_InforService service;
    @Autowired
    private Area_infoService area_infoService;
    @GetMapping()
    @ResponseBody
    public List<Person_Info> queryAll(){
        System.out.println(service.queryAll());
        return service.queryAll();
    }
    @GetMapping("/{id}")
    @ResponseBody
    public Person_Info queryById(@PathVariable("id") Integer id){
        return service.selectByPrimaryKey(id);
    }
    @GetMapping("/area")
    @ResponseBody
    public List<Area_Info> queryArea(){
       return area_infoService.queryAll();
    }
    @PutMapping()
    @ResponseBody
    public String update(Person_Info person_info){
       int result= service.updateByPrimaryKeySelective(person_info);
       return result==1?"true":"false";
    }
    @PostMapping()
    @ResponseBody
    public String add(Person_Info info){
       int result= service.insertSelective(info);
       return result==1?"true":"false";
    }
    @DeleteMapping("/{id}")
    @ResponseBody
    public String delete(@PathVariable("id") Integer id){
        int result = service.deleteByPrimaryKey(id);
        return result==1?"true":"false";
    }
}
