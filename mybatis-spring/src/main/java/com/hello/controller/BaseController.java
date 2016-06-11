package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by peker on 16/6/12.
 */
@Controller
@RequestMapping("/base")
public class BaseController {
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/aboutus", method = RequestMethod.GET)
    public String aboutus() {
        return "aboutus";
    }

    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public String news() {
        return "news";
    }
}
