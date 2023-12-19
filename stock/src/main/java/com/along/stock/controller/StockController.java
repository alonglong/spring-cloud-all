package com.along.stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author along
 * @Date 2023/12/15 20:07
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @GetMapping("/deduct")
    public String deduct() {
        System.out.println("扣减库存！");
        return "扣减库存";
    }
}
