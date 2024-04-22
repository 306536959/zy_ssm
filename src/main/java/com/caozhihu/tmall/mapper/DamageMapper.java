package com.caozhihu.tmall.mapper;

import com.caozhihu.tmall.pojo.Damage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DamageMapper {
    @Select("select * from damage")
    List<Damage> list();
    @Insert("insert into damage(name,cause,num,time) values(#{name},#{cause},#{num},#{time})")
    void add(Damage damage);
}
