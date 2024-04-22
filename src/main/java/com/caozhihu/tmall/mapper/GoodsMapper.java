package com.caozhihu.tmall.mapper;

import com.caozhihu.tmall.pojo.Goods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;
import java.util.List;

public interface GoodsMapper {
    @Select("select * from goodsinfo")
    List<Goods> list();
    @Select("select * from goodsinfo where name like concat('%', #{name}, '%')")
    List<Goods> search(@Param("name") String name);
    @Select("select * from goodsinfo where name like concat('%', #{name}, '%')")
    List<Goods> searchByName(@Param("name") String name);

    @Select("select * from goodsinfo where name like concat('%', #{name}, '%') and price = #{price}")
    List<Goods> searchByNameAndPrice(@Param("name") String name, @Param("price") BigDecimal price);

    @Select("select * from goodsinfo where name like concat('%', #{name}, '%') and price = #{price} and type = #{type}")
    List<Goods> searchByNameAndPriceAndType(@Param("name") String name, @Param("price") BigDecimal price, @Param("type") String type);

    @Select("select * from goodsinfo where type = #{type}")
    List<Goods> searchByType(@Param("type") String type);
    @Select("select * from goodsinfo where price = #{price}")
    List<Goods> searchByPrice(@Param("price") BigDecimal price);
    @Select("select * from goodsinfo where price = #{price} and type = #{type}")
    List<Goods> searchByPriceAndType(@Param("price") BigDecimal price,@Param("type") String type);
    @Select("select * from goodsinfo where name like concat('%', #{name}, '%') and type = #{type}")
    List<Goods> searchByNameAndType(@Param("name") String name,@Param("type") String type);
    @Insert("insert into goodsinfo(name, price, num, type,time) values(#{name}, #{price},#{num}, #{type},#{time} )")
    void insert(Goods goods);
    @Select("select * from goodsinfo where name = #{name}")
    Goods selectByName(@Param("name") String name);
    @Update("update goodsinfo set oldtime =#{oldtime},price = #{price}, num = #{num}, type = #{type}, time = #{time} Where name = #{name}")
    void updata(Goods goods);
}
