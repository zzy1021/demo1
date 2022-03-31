package com.example.demo1.controller;

import com.example.demo1.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class controller {

    @Autowired
   JdbcTemplate jdbcTemplate;
    @GetMapping("/")
    public String logpage(){
        return "login";
    }
    @RequestMapping(value="/index.html" )
    public String main(user user, HttpSession httpSession, Model model){
        if (user.getName().equals("admin")&&user.getPassword().equals("123456")){
            httpSession.setAttribute("user",user);
            return "redirect:main1";
        }
        model.addAttribute("mgs","mimacuowu重新登录");
        return "login";
    }
    @GetMapping("/main1")
    public String main1(HttpSession httpSession,Model model){
        Object user = httpSession.getAttribute("user");
        if (user!=null){
            return "index";
        }else {
            model.addAttribute("mgs","请登录");
            return "login";
        }

    }
    @ResponseBody
    @GetMapping("/sql")
    public Long druid(){
        Long aLong = jdbcTemplate.queryForObject("SELECT count(*) FROM t_user", Long.class);
      return aLong;

    }
}
