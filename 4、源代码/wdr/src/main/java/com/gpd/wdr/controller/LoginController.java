package com.gpd.wdr.controller;

import com.gpd.wdr.entity.User;
import com.gpd.wdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

/**
 * 登录验证类
 * @author Administrator
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    /**
     *用于访问登录页面
     * @return
     */
    @RequestMapping("/login")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("/register")
    public String toRegister(){
        return "register";
    }

    /**
     * 用于登录验证
     * @param httpSession
     * @param user
     * @return
     */
    @RequestMapping("/login/do")
    @ResponseBody
    public User login(HttpSession httpSession, @RequestBody User user){
        User resultUS=userService.selectByPrimaryKey(user.getUserId());
        if (resultUS!=null){
            if (user.getUserPassword().equals(resultUS.getUserPassword())){
                user.setUserState(resultUS.getUserState());
                httpSession.setAttribute("loginUser",resultUS);
            }else {
                user.setUserState(-1);
            }
        }else {
            user.setUserState(0);
        }
        return user;
    }
    @RequestMapping("login/out")
    public  String Loginout(SessionStatus sessionStatus){
        sessionStatus.setComplete();
        return "login";
    }

}
