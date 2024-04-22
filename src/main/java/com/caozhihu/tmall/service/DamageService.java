package com.caozhihu.tmall.service;

import com.caozhihu.tmall.pojo.Damage;
import com.caozhihu.tmall.pojo.Depreciation;

import java.util.List;

public interface DamageService {
    List<Damage> list();

    void add(Damage damage);
}
