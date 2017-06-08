package com.vidor.controllers;

import com.vidor.model.Github;
import com.vidor.service.GithubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tim on 2017/6/6.
 */
@Controller
public class GithubController {

    private final static String A_GITHUB_USER = "aGithubUser";

    private final GithubService githubService;

    @Autowired
    public GithubController(GithubService githubService) {
        this.githubService = githubService;
    }


    @RequestMapping(value = "/searchAGithubUser.html", method = RequestMethod.GET)
    public ModelAndView searchAGithubUser(HttpServletRequest servletRequest,
          @RequestParam(value = "username", required = true) String username) {

        Github user = githubService.findAGithubUser(username);

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("user", user);
        model.put("testT", "123");
        return new ModelAndView(A_GITHUB_USER, model);
    }
}
