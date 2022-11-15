package com.demo.service.impl;

import com.demo.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * <p>Description : {} </p>
 *
 * @author : chaos
 * @version : v1.0.0
 * @since : 2022/11/15 10:12
 **/
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String query() {
        return "OK";
    }
}
