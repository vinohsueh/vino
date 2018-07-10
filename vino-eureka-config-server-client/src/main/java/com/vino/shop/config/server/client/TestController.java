package com.vino.shop.config.server.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建时间：2017年11月22日 下午4:47:21
 * @author  lby
 */
@RestController
@RefreshScope
public class TestController {
    @Value("${foo}")
    String foo;

    @Value("${foo1}")
    String foo1;

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }

    @RequestMapping(value = "/hi1")
    public String hi1(){
        return foo1;
    }
}
