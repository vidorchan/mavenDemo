package com.vidor.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by tim on 2017/6/27.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login.html")
    public String login() {
        return "login";
    }
}
