package com.space.alzheimer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName IndexController
 * @Description: TODO
 * @Author ljh
 * @Date 2020/5/17
 **/
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("/")
    public String index(HttpServletResponse response) throws IOException {
        return "index.html";
    }
}