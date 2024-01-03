package com.Box.schesmou.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class homeController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
