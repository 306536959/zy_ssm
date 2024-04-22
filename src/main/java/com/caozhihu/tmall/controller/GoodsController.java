package com.caozhihu.tmall.controller;

import com.caozhihu.tmall.pojo.Goods;
import com.caozhihu.tmall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("")

public class GoodsController {
    @Autowired
    GoodsService goodsService;
    @RequestMapping("admin_goods_list")
    public String list(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        String price =request.getParameter("price");
        String type = request.getParameter("type");
        System.out.printf("name"+ name+"price"+price+"type"+type);
        List<Goods> list;

        if (name != null||type != null||price != null) {
            // 如果存在查询关键词，执行搜索操作
            list = goodsService.search(name, price, type);
        } else {
            // 否则，获取所有商品列表
            list = goodsService.list();
        }

        model.addAttribute("list", list);
        return "admin/listGoods";
    }
    @RequestMapping("add_goods")
    public String add() {

//        goodsService.add(goods);
        return "admin/add_goods";
    }
    @RequestMapping("/add_goodsInfo")
    public String add_goodsInfo(Goods goods) {
        goodsService.add(goods);
        return "redirect:admin_goods_list";
    }



}
