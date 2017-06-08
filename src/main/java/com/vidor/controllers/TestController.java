package com.vidor.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by tim on 2017/6/6.
 */
@Controller
public class TestController {

    @RequestMapping(value = "/admin")
    @ResponseBody
    public String testSpring(){
        return "My testSpring";
    }

    @RequestMapping(value = "/admin1")
    public ModelAndView testM() {
        return new ModelAndView("index", null);
    }
}
