package com.fatecrl.mvcdemo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homecontroller {

    @GetMapping("/") //Esta associando a raiz do site
    public String Home() {

        return "index";

    }



}
