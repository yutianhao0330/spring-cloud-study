package com.yutianhao.sc.scgoodsconsumer.controller;

import com.yutianhao.sc.scgoodscommon.entity.Goods;
import com.yutianhao.sc.scgoodsconsumer.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author thyu
 * @title: GoodsController
 * @projectName yutianhao-eureka-ribbon-parent
 * @description: TODO
 * @date 2020/7/16 9:23
 */
@RestController
@RequestMapping("goods")
public class GoodsController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private GoodService goodService;
    @RequestMapping("listall")
    public String list(){
        return restTemplate.getForObject("http://sc-user-service/goods/list",String.class);
    }
    @RequestMapping("getById")
    public String getById(Integer id){
        return restTemplate.getForObject("http://sc-user-service/goods/getById?gid="+id,String.class);
    }
    @RequestMapping("listf")
    public List<Goods> listf(){
        return goodService.list();
    }

    @RequestMapping("getByIdf")
    public Goods getByIdf(Integer id){
        return goodService.getById(id);
    }
}
