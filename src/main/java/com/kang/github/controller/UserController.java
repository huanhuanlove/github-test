package com.kang.github.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: kang
 * @Company: 康康小课堂
 * @DateTime: 2020-12-25-16:45
 * @Description: 描述
 */
@RestController
@RequestMapping("user")
public class UserController {

    public void fun1() {
        System.out.println("fun1");
    }
}
