package com.along.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author along
 * @Date 2023/12/16 23:35
 */
@RestController
@RequestMapping("/config")
@RefreshScope // 动态刷新配置
public class ConfigController {

    @Value("${user.name}")
    private String userName;

    @GetMapping("/show")
    public String show(){
        return userName;
    }

}
