package com.gpd.wdr.controller;


import com.gpd.wdr.entity.Orderform;
import com.gpd.wdr.service.OrderformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Administrator
 */
@Controller
public class OrderFormMController {
    @Autowired
    private OrderformService orderformService;
    @RequestMapping("orderFormManager")
    public String  toOrderFormManager(Model model){
        List<Orderform> resultSA=orderformService.selectAll();
        model.addAttribute("orderFormList",resultSA);
        return "orderFormManager";
    }
    @RequestMapping("/addOrderform/do")
    @ResponseBody
    public int addOrderform(@RequestBody Orderform orderform){
        int result;
        Orderform resultSBP=orderformService.selectByPrimaryKey(orderform.getOrderId());
        if (resultSBP==null){
            result=orderformService.addSelective(orderform);
            return result;
        }else {
            result=-1;
            return result;
        }
    }
    @RequestMapping("/updateOrderform/do")
    @ResponseBody
    public int updateOrderform(@RequestBody Orderform orderform){
        int result=orderformService.updateByPrimaryKeySelective(orderform);
        return result;
    }
    @RequestMapping("/deleteOrderform/do")
    @ResponseBody
    public int deleteOrderform(@RequestBody Orderform orderform){
        int result=orderformService.deleteByPrimaryKey(orderform.getOrderId());
        return result;
    }
}
