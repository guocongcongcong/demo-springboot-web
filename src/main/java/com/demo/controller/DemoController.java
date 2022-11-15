package com.demo.controller;

import com.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description : {} </p>
 *
 * @author : chaos
 * @version : v1.0.0
 * @since : 2022/11/15 10:11
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @PostMapping("/query")
    public String query() {
      return demoService.query();
    }

}
