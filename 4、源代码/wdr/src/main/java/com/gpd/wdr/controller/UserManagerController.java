package com.gpd.wdr.controller;

import com.gpd.wdr.entity.User;
import com.gpd.wdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Administrator
 */
@Controller
public class UserManagerController {
    @Autowired
    private UserService userService;
    @RequestMapping("/userData")
    public String toUserData(){
        return "userData";
    }
    @RequestMapping("/userManager")
    public String toUserManager(Model model){
       List<User> resultSA=userService.selectAll();
        model.addAttribute("userList",resultSA);
        return "userManager";
    }
    @RequestMapping("/register/do")
    @ResponseBody
    public int register(@RequestBody User user){
        int result;
        User resultSBK=userService.selectByPrimaryKey(user.getUserId());
        if (resultSBK==null) {
            result=userService.addSelective(user);
        }else {
            result=-1;
        }
        return result;
    }
    @RequestMapping("/addUser/do")
    @ResponseBody
    public int addUser(@RequestBody User user){
        int result;
        User resultSBP=userService.selectByPrimaryKey(user.getUserId());
        if (resultSBP==null){
             result=userService.addSelective(user);
            return result;
        }else {
            result=-1;
            return result;
        }
    }
    @RequestMapping("/updateUser/do")
    @ResponseBody
    public int updateUser(@RequestBody User user){
        int result=userService.updateByPrimaryKeySelective(user);
        return result;
    }
    @RequestMapping("/deleteUser/do")
    @ResponseBody
    public int deleteUser(@RequestBody User user){
        int result=userService.deleteByPrimaryKey(user.getUserId());
        return result;
    }

}
