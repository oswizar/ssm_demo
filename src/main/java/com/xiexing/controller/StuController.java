package com.xiexing.controller;

import com.xiexing.entities.Stu;
import com.xiexing.service.StuService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.logging.Logger;

public class StuController {
    private StuService stuService;



    @RequestMapping("/getAllUser")
    public String getAllUser(HttpServletRequest request, Model model){
        List<Stu> list = stuService.findAll();
        System.out.println(list);
        model.addAttribute("list",list);
        request.setAttribute("list",list);
        return "findAll";
    }

    @RequestMapping("/addUser")
    public String addUser(Stu stu,Model model){
        stuService.save(stu);
        return "save";
    }

    @RequestMapping("/updateUser")
    public String updateUser(Stu stu,HttpServletRequest request,Model model){
        if(stuService.update(stu)){
            stu = stuService.findById(stu.getId());
            request.setAttribute("stu",stu);
            model.addAttribute("stu",stu);
            return "update";
        }
        else {
            return "error";
        }
    }

    @RequestMapping("/getUser")
    public String getUser(int id,HttpServletRequest request,Model model){
        Stu stu = stuService.findById(id);
        request.setAttribute("stu",stu);
        model.addAttribute("stu",stu);
        return "findById";

    }

    @RequestMapping("/delUser")
    public String delUser(int id){
        stuService.delete(id);
        return "delete";
    }

    @RequestMapping("register")
    public String register(Stu stu,Model model){
        stuService.save(stu);
        return "register";

    }

    @RequestMapping("/login")
    public String login(Stu stu,Model model){
        Stu s = stuService.login(stu);
        if(s!=null){
            return "login";

        }
        else {
            return "error";
        }

    }
}


































