package com.gpd.wdr.controller;

import com.gpd.wdr.entity.Orderform;
import com.gpd.wdr.entity.User;
import com.gpd.wdr.service.OrderformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class OrderFormController {
    @Autowired
    private OrderformService orderformService;
    @RequestMapping("/orderForm")
    public String toOrderForm(HttpSession session, Model model){
        Object obj=session.getAttribute("loginUser");
        User user= (User) obj;
        System.out.println(user.getUserId()+"user:"+user.getUserName());
        List<Orderform> resultOSBU=orderformService.selectByUserId(user.getUserId());
        model.addAttribute("orderFormList",resultOSBU);
        return "orderForm";
    }

}
