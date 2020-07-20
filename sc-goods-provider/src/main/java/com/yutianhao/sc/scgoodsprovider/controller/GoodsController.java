package com.yutianhao.sc.scgoodsprovider.controller;


import com.yutianhao.sc.scgoodscommon.entity.Goods;
import com.yutianhao.sc.scgoodsprovider.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author thyu
 * @since 2020-07-16
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private IGoodsService iGoodsService;
    @RequestMapping("list")
    public List<Goods> list(){
        System.out.println("服务1查询........");
        return iGoodsService.list();
    }
    @RequestMapping("getById")
    public Goods getById(Integer gid){
        System.out.println("服务1查询........");
        return iGoodsService.getById(gid);
    }
}

