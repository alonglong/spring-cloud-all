package com.along.order.feign;

import org.springframework.stereotype.Component;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author along
 * @Date 2023/12/17 13:16
 */
@Component
public class StockFeignServiceFallback implements StockFeignService {
    @Override
    public String deduct() {
        return "降级了";
    }
}
