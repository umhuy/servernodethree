package com.houyer.servernodethree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("server")
public class NodeController {

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "node3";
    }
}
