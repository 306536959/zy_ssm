package com.caozhihu.tmall.controller;

import com.caozhihu.tmall.pojo.Damage;
import com.caozhihu.tmall.pojo.Depreciation;
import com.caozhihu.tmall.pojo.Goods;
import com.caozhihu.tmall.service.DepreciationService;
import com.caozhihu.tmall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("")

public class DepreciationController {
    @Autowired
    DepreciationService depreciationService;
    @Autowired
    GoodsService goodsService;
    @RequestMapping("admin_depreciation_list")
    public String list(Model model) {
        List<Depreciation> depreciations = depreciationService.list();
        model.addAttribute("depreciations", depreciations);
        return "admin/listDepreciation";
    }
    @RequestMapping("addDepreciationGoods")
    public String addDamageGoods(Depreciation depreciation) {
        depreciation.setTime(String.valueOf(LocalDateTime.now()));
        Goods goods = goodsService.selectByName(depreciation.getName());
        goods.setPrice(depreciation.getPrice());
        goods.setOldtime(String.valueOf(LocalDateTime.now()));
        goodsService.updata(goods);
        depreciationService.add(depreciation);
        return "redirect:admin_depreciation_list";
    }
    @RequestMapping("depreciationGoods")
    public String damageGoods() {
        return "admin/depreciationGoods";
    }
}
