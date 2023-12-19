package com.along.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author along
 * @Date 2023/12/15 20:07
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private final RestTemplate restTemplate;

    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/add")
    public String add() {
        System.out.println("下单成功！");
        String response = restTemplate.getForObject("http://localhost:8011/stock/deduct", String.class);

        return "hello word" + response;
    }
}
