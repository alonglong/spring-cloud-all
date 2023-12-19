package com.along.order.controller;

import com.along.order.feign.ProductFeignService;
import com.along.order.feign.StockFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author along
 * @Date 2023/12/15 20:07
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private final StockFeignService stockFeignService;
    private final ProductFeignService productFeignService;

    public OrderController(StockFeignService stockFeignService, ProductFeignService productFeignService) {
        this.stockFeignService = stockFeignService;
        this.productFeignService = productFeignService;
    }


    @GetMapping("/add")
    public String add() {
        System.out.println("下单成功！");
        String deduct = stockFeignService.deduct();
        String product = productFeignService.get("1");

        return "hello feign" + deduct + product;
    }
}
