package com.yutianhao.sc.scgoodsconsumer2.service;

import com.yutianhao.sc.scgoodscommon.entity.Goods;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author thyu
 * @title: GoodServiceMock
 * @projectName yutianhao-eureka-ribbon-parent
 * @description: TODO
 * @date 2020/7/17 8:48
 */
@Component
public class GoodServiceMock implements GoodService{

    @Override
    public List<Goods> list() {
        List<Goods> list = new ArrayList<>();
        list.add(new Goods().setId(5).setName("名牌服装")
                .setIdNo("12315").setNorms("M")
                .setNum(15).setPrice(new BigDecimal(255))
                .setTotalprice(new BigDecimal(1250))
                .setType("XXX"));
        list.add(new Goods().setId(5).setName("李宁服装")
                .setIdNo("53321").setNorms("MM")
                .setNum(15).setPrice(new BigDecimal(255))
                .setTotalprice(new BigDecimal(1250))
                .setType("XXX"));
        list.add(new Goods().setId(5).setName("阿迪服装")
                .setIdNo("13213").setNorms("M")
                .setNum(15).setPrice(new BigDecimal(255))
                .setTotalprice(new BigDecimal(1250))
                .setType("XXX"));
        return list;
    }

    @Override
    public Goods getById(Integer id) {
        return new Goods().setId(5).setName("名牌服装")
                .setIdNo("12315").setNorms("M")
                .setNum(15).setPrice(new BigDecimal(255))
                .setTotalprice(new BigDecimal(1250))
                .setType("XXX");
    }
}
