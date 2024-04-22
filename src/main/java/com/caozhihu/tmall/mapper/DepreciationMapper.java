package com.caozhihu.tmall.mapper;

import com.caozhihu.tmall.pojo.Depreciation;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DepreciationMapper {

    @Select("select * from depreciation")
    List<Depreciation> list();
    @Insert("insert into depreciation(name,price,time) values(#{name},#{price},#{time})")
    void add(Depreciation depreciation);
}
