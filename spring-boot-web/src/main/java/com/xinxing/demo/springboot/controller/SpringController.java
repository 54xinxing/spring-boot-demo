package com.xinxing.demo.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class SpringController {

    @RequestMapping("/get")
    @ResponseBody
    public JSONObject get(@RequestBody(required = false) JSONObject jsonObject){
        return jsonObject;
    }
}
