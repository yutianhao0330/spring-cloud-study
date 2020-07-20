package com.yutianhao.sc.scconfigbusclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author thyu
 * @title: ConfigTestController
 * @projectName yutianhao-eureka-ribbon-parent
 * @description: TODO
 * @date 2020/7/20 17:19
 */
@RestController
@RequestMapping("config")
@RefreshScope
public class ConfigTestController {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;
    @RequestMapping("test")
    public String test(){
        return "name:"+name+"@@@@@@@ age="+age;
    }
}
