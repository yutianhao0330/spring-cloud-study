package com.yutianhao.sc.scgoodsconsumer2.service;

import com.yutianhao.sc.scgoodscommon.entity.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author thyu
 * @title: GoodsInterface
 * @projectName yutianhao-eureka-ribbon-parent
 * @description: TODO
 * @date 2020/7/16 12:24
 */
//@FeignClient(name = "sc-user-service",fallback = GoodServiceMock.class)
@FeignClient(name = "sc-user-service")
public interface GoodService {
    @RequestMapping("/goods/list")
    List<Goods> list();
    @RequestMapping("/goods/getById")
    Goods getById(@RequestParam("gid") Integer id);
}
