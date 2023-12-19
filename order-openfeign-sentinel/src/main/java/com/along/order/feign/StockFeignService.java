package com.along.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author along
 * @Date 2023/12/16 15:23
 */
@FeignClient(name = "stock-service", path = "stock", fallback = StockFeignServiceFallback.class)
public interface StockFeignService {

    @GetMapping("/deduct")
    String deduct();
}
