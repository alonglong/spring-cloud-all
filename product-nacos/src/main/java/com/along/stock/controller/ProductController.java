package com.along.stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author along
 * @Date 2023/12/15 20:07
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/{id}")
    public String get(@PathVariable("id") String id) {
        System.out.println("查询商品：" + id);
        return "查询商品" + id + "成功!";
    }
}
