package com.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class tablecontroller {

    @GetMapping("/basic_table")
    public String basic_table() {
        return "basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table() {
        return "dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table() {
        return "responsive_table";
    }

    @GetMapping("/editable_table")
    public String editable_table() {
        return "editable_table";
    }


}
