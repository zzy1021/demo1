package com.example.demo1.controller;

import jdk.internal.org.objectweb.asm.Handle;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Log4j
@Controller
public class formController {

    @GetMapping("form_layouts")
    public String form_layouts(){
        return"from/form_layouts";
    }
    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("password")String passwrod,
                         @RequestParam("heederimg") MultipartFile heederimg) throws IOException {
        org.apache.log4j.Logger log = formController.log;
        log.info("上传的信息"+email+passwrod+heederimg.getSize());
        if (!heederimg.isEmpty()){
            String originalFilename = heederimg.getOriginalFilename();
            heederimg.transferTo(new File("E://"+originalFilename));
        }


        return"main1";
    }
}
