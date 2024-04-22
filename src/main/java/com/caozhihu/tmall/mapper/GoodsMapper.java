package com.caozhihu.tmall.mapper;

import com.caozhihu.tmall.pojo.Goods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface GoodsMapper {
    @Select("select * from goodsinfo")
    List<Goods> list();
    @Select("select * from goodsinfo where name like concat('%', #{name}, '%')")
    List<Goods> search(String name,String price,String type);
    @Select("select * from goodsinfo where name like concat('%', #{name}, '%')")
    List<Goods> searchByName(String name);

    @Select("select * from goodsinfo where name like concat('%', #{name}, '%') and price = #{price}")
    List<Goods> searchByNameAndPrice(String name, String price);

    @Select("select * from goodsinfo where name like concat('%', #{name}, '%') and price = #{price} and type = #{type}")
    List<Goods> searchByNameAndPriceAndType(String name, String price, String type);

    @Select("select * from goodsinfo where type = #{type}")
    List<Goods> searchByType(String type);
    @Select("select * from goodsinfo where price = #{price}")
    List<Goods> searchByPrice(String price);
    @Select("select * from goodsinfo where price = #{price} and type = #{type}")
    List<Goods> searchByPriceAndType(String price, String type);
    @Select("select * from goodsinfo where name like concat('%', #{name}, '%') and type = #{type}")
    List<Goods> searchByNameAndType(String name, String type);
    @Insert("insert into goodsinfo(name, price, num, type,time) values(#{name}, #{price},#{num}, #{type},#{time} )")
    void insert(Goods goods);
    @Select("select * from goodsinfo where name = #{name}")
    Goods selectByName(String name);
    @Update("update goodsinfo set oldtime =#{oldtime},price = #{price}, num = #{num}, type = #{type}, time = #{time} Where name = #{name}")
    void updata(Goods goods);
}
