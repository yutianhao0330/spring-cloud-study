package com.yutianhao.sc.scgoodsconsumer2.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yutianhao.sc.scgoodscommon.entity.Goods;
import com.yutianhao.sc.scgoodsconsumer2.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
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
    @HystrixCommand(fallbackMethod = "getByIdfMock")
    public Goods getByIdf(Integer id){
        return goodService.getById(id);
    }

    public Goods getByIdfMock(Integer id){
        return new Goods().setId(5).setName("mock-controller服装.....")
                .setIdNo("12315").setNorms("M")
                .setNum(15).setPrice(new BigDecimal(255))
                .setTotalprice(new BigDecimal(1250))
                .setType("XXX");
    }
}
