package com.hello.controller;

import com.hello.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;

/**
 * Created by peker on 16/6/1.
 */
@Controller
public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Resource
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {

        logger.info("User id = 1, user = {}", userService.getUser(1).getUsername());
        logger.error("This is Error message", new Exception("Testing"));
        model.addAttribute("msg", "Hello Spring MVC + Logback");
        return "welcome";
    }

}