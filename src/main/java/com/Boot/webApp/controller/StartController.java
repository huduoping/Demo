package com.Boot.webApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hdp
 */
@Controller
public class StartController {

    @RequestMapping("/")
    public String start() {
        return "index";
    }

}
