package com.offcn.thymeleadfdemo;

import com.offcn.thymeleadfdemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@Controller
public class MyController {
    @RequestMapping("/index")
    public String index(Model model){
        String message="hello thymeleaf";
        model.addAttribute("message",message);
        System.out.println("分支1");
        System.out.println("修改完成可以合并");
        return "index";
    }
    @RequestMapping("/getUser")
    public String getUser(Model model){
        User user = new User(1,"jack",18);
        model.addAttribute("user",user);
        HashMap<String, Object> map = new HashMap<>();
        map.put("s1","1.jpg");
        map.put("s2","2.jpg");
        model.addAttribute("src",map);
        return "index2";
    }
    @RequestMapping("/getUserList")
    public String getUserList(Model model){
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(1,"jack",18));
        list.add(new User(2,"tony",28));
        list.add(new User(3,"jj",38));
        list.add(new User(4,"tom",48));
        model.addAttribute("list",list);
        return "index3";
    }
    @RequestMapping("/index4")
    public String index4(Model model){
        model.addAttribute("username","kk");
        model.addAttribute("href","ww.baidu.com");
        return "index4";
    }
    @RequestMapping("/index5")
    public String index5(Model model){
        model.addAttribute("result","r");
        model.addAttribute("menu","manager");
        model.addAttribute("menu","admin");
        return "index5";
    }
    @RequestMapping("/index6")
    public String index6(){
        return "index6";
    }
    @RequestMapping("/index7")
    public String index7(Model model){
        //日期
        Date date = new Date();
        model.addAttribute("date",date);
        //数字的格式化
        model.addAttribute("num",3.14159);
        //自符串
        String str = "天气好好";
        model.addAttribute("str",str);
        //字符串截取
        String str2 = "是谁给你的勇气";
        model.addAttribute("str2",str2);
        return "index7";

    }
}
