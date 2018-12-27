package com.controller;

import com.modal.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import org.apache.log4j.Logger;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    private static Logger logger = Logger.getLogger(UserController.class);
    @RequestMapping("/tDelete")
    public String tDelete(){
        logger.info("跳转删除");
        return "delete";
    }
    @RequestMapping("/tAdd")
    public String tAdd(){
        logger.info("跳转添加");
        return "add";
    }
    @RequestMapping("/tChange")
    public String tChange(){
        logger.info("跳转更改");
        return "update";
    }
    @RequestMapping("/tSelect")
    public String tSelect(){
        logger.info("跳转查询");
        return "select";
    }
    @RequestMapping("/selectAll")
    public String selectAll(Model model){
        List<User> userList=userService.selectAll();
        model.addAttribute("list",userList);
        logger.info("查询所有");
        return "showAll";
    }
    @RequestMapping("/add")
    public String add(String username,String password){
        User user=new User(username,password);
        userService.add(user);
        logger.info("添加");
        return "success";
    }
    @RequestMapping("/delete")
    public String delete(int id){
        userService.delete(id);
        logger.info("删除");
        return "success";
    }
    @RequestMapping("/change")
    public String change(Integer id,String username,String password){
        User user= new User(id,username,password);
        userService.change(user);
        logger.info("更改");
        return "success";
    }
    @RequestMapping("/select")
    public String select(int id,Model model){
        String username = userService.select(id);
        logger.info("查询");
        model.addAttribute("username",username);
        return "selectResult";
    }
}
