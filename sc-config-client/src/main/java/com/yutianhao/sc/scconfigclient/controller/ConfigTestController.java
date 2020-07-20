package com.yutianhao.sc.scconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author thyu
 * @title: ConfigTestController
 * @projectName yutianhao-eureka-ribbon-parent
 * @description: TODO
 * @date 2020/7/20 15:58
 */
@RestController
@RequestMapping("config")
@RefreshScope
public class ConfigTestController {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;
    @RequestMapping("result")
    public String result(){
        return "name="+name+" @@@ age="+age;
    }
}
