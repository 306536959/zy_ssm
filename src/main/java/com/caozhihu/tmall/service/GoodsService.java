package com.caozhihu.tmall.service;

import com.caozhihu.tmall.pojo.Goods;

import java.math.BigDecimal;
import java.util.List;

public interface GoodsService {
    List<Goods> list();

    List<Goods> search(String name, BigDecimal price, String type);

    void add(Goods goods);

    Goods selectByName(String name);

    void updata(Goods goods);
}
