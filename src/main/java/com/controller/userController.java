package com.controller;

import com.modal.User;
import com.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class userController {
    @Autowired
    userService userService;

    @RequestMapping("/tdelete")
    public String tdelete(){
        System.out.println("你好");
        return "delete";
    }
    @RequestMapping("/tadd")
    public String tadd(){
        System.out.println("你好");
        return "add";
    }
    @RequestMapping("/tchange")
    public String tchange(){
        System.out.println("你好");
        return "update";
    }
    @RequestMapping("/tselect")
    public String tselect(){
        System.out.println("你好");
        return "select";
    }
    @RequestMapping("/selectAll")
    public String selectAll(Model model){
        List<User> userList=userService.selectAll();
        model.addAttribute("list",userList);
        return "showAll";
    }

    @RequestMapping("/a")
    public String a(){
        System.out.println("你好");
        return "index";
    }
    @RequestMapping("/add")
    public String add(String username,String password){
        User user=new User(username,password);
        userService.add(user);
        System.out.println("增加");
        return "success";
    }
    @RequestMapping("/delete")
    public String delete(int id){
        userService.delete(id);
        System.out.println("删除");
        return "success";
    }
    @RequestMapping("/change")
    public String change(Integer id,String username,String password){
        System.out.println("id="+id+"password="+password);
        User user= new User(id,username,password);

        userService.change(user);
        System.out.println("更改");

        return "success";
    }
    @RequestMapping("/select")
    public String select(int id,Model model){

        String username = userService.select(id);
        System.out.println("查询");
        model.addAttribute("username",username);

        return "selectResult";
    }

}
