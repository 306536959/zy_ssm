package com.caozhihu.tmall.controller;

import com.caozhihu.tmall.pojo.Damage;
import com.caozhihu.tmall.pojo.Depreciation;
import com.caozhihu.tmall.pojo.Goods;
import com.caozhihu.tmall.service.DamageService;
import com.caozhihu.tmall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("")

public class DamageController {
    @Autowired
    DamageService damageService;;
    @Autowired
    GoodsService goodsService;
    @RequestMapping("admin_damage_list")
    public String list(Model model) {
        List<Damage> damages = damageService.list();
        model.addAttribute("damage", damages);
        return "admin/listDamage";
    }
    @RequestMapping("damageGoods")
    public String addDamageGoods() {

        return "admin/damageGoods";
    }
    @RequestMapping("addDamageGoods")
    public String damageGoods(Damage damage) {
        damage.setTime(String.valueOf(LocalDateTime.now()));
        damageService.add(damage);
        Goods goods = goodsService.selectByName(damage.getName());
        goods.setNum(goods.getNum() - damage.getNum());
        goodsService.updata(goods);
        return "redirect:admin_damage_list";
    }
}
