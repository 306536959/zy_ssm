package com.caozhihu.tmall.service.impl;

import com.caozhihu.tmall.mapper.GoodsMapper;
import com.caozhihu.tmall.pojo.Goods;
import com.caozhihu.tmall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public List<Goods> list() {
        return goodsMapper.list();
    }

    @Override
    public List<Goods> search(String name, String price, String type) {
        if (name == null || name.isEmpty()) {
            if (price == null || price.isEmpty()) {
                if (type == null || type.isEmpty()) {

                    return goodsMapper.list();
                } else {

                    return goodsMapper.searchByType(type);
                }
            } else if (type == null || type.isEmpty()) {

                return goodsMapper.searchByPrice(price);
            } else {

                return goodsMapper.searchByPriceAndType(price, type);
            }
        } else {

            if (price == null || price.isEmpty()) {
                if (type == null || type.isEmpty()) {

                    return goodsMapper.searchByName(name);
                } else {

                    return goodsMapper.searchByNameAndType(name, type);
                }
            } else if (type == null || type.isEmpty()) {

                return goodsMapper.searchByNameAndPrice(name, price);
            } else {

                return goodsMapper.searchByNameAndPriceAndType(name, price, type);
            }
        }
    }

    @Override
    public void add(Goods goods) {
        goods.setTime(String.valueOf(LocalDateTime.now()));
        goodsMapper.insert(goods);
    }

    @Override
    public Goods selectByName(String name) {
        return goodsMapper.selectByName(name);
    }

    @Override
    public void updata(Goods goods) {
        goodsMapper.updata(goods);
    }


}
