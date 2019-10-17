package com.gpd.wdr.controller;

import com.gpd.wdr.entity.Weddingdress;
import com.gpd.wdr.service.WeddingdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HotListController {
    @Autowired
    private WeddingdressService weddingdressService;
    @RequestMapping("/hotList")
    public String toHotList(Model model){
        List<Weddingdress> resultWSBN=weddingdressService.selectByNum();
        model.addAttribute("hotWeddingDressList",resultWSBN);
        return "hotList";
    }
}
