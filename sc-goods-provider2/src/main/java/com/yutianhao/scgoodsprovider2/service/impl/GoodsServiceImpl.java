package com.yutianhao.scgoodsprovider2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yutianhao.sc.scgoodscommon.entity.Goods;
import com.yutianhao.scgoodsprovider2.mapper.GoodsMapper;
import com.yutianhao.scgoodsprovider2.service.IGoodsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author thyu
 * @since 2020-07-16
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
