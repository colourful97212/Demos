package com.colourful.springbootlittiledemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.colourful.springbootlittiledemo.dao.DdlDemo;
import com.colourful.springbootlittiledemo.service.FirstSerivce;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Version
 * @Date 7/17/2020
 * @Author Gon
 */

@Slf4j
@RestController
public class FirstController
{
    @Autowired
    FirstSerivce firstSerivce;

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/first")
    public JSONObject first()
    {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message", "Hello World");
        return jsonObject;
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/ddlDemo")
    public JSONObject ddlDemo()
    {
        firstSerivce.DdlDemo();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message", "Hello World");
        return jsonObject;
    }
}
