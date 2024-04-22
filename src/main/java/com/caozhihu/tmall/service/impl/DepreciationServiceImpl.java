package com.caozhihu.tmall.service.impl;

import com.caozhihu.tmall.mapper.DepreciationMapper;
import com.caozhihu.tmall.pojo.Depreciation;
import com.caozhihu.tmall.service.DepreciationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepreciationServiceImpl implements DepreciationService {
    @Autowired
    DepreciationMapper depreciationMapper;
    @Override
    public List<Depreciation> list() {
        return depreciationMapper.list();
    }

    @Override
    public void add(Depreciation depreciation) {
        depreciationMapper.add(depreciation);
    }
}
