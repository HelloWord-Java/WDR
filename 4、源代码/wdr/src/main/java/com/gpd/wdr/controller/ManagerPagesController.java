package com.gpd.wdr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 */
@Controller
public class ManagerPagesController {
    @RequestMapping("/managerPages")
    private String  toManager(){
        return "managerPages";
    }
}
