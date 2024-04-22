package com.caozhihu.tmall.service;

import com.caozhihu.tmall.pojo.Depreciation;

import java.util.List;

public interface DepreciationService {
    List<Depreciation> list();

    void add(Depreciation depreciation);
}
