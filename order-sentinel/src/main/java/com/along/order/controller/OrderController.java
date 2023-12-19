package com.along.order.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/add")
    @SentinelResource(value = "add", blockHandler = "addBlockHandler")
    public String add() {
        System.out.println("下单成功！");

        return "下单成功";
    }


    public String addBlockHandler(BlockException e) {
        return "流控";
    }


    @GetMapping("/get/{id}")
    @SentinelResource(value = "getById", blockHandler = "hotBlockHandler")
    public String getById(@PathVariable("id") Integer id) {
        System.out.println("正常访问");
        return "正常访问";
    }

    public String hotBlockHandler(@PathVariable("id") Integer id, BlockException e) {

        return "热点异常处理";
    }





}
