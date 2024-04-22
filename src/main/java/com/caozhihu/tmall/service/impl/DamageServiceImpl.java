package com.caozhihu.tmall.service.impl;

import com.caozhihu.tmall.mapper.DamageMapper;
import com.caozhihu.tmall.pojo.Damage;
import com.caozhihu.tmall.pojo.Depreciation;
import com.caozhihu.tmall.service.DamageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DamageServiceImpl implements DamageService {
    @Autowired
    DamageMapper damageMapper;
    @Override
    public List<Damage> list() {
        return damageMapper.list();
    }

    @Override
    public void add(Damage damage) {
       damageMapper.add(damage);
    }
}
