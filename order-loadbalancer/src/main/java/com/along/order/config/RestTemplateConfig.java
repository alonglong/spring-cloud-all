package com.along.order.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author along
 * @Date 2023/12/15 20:14
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced // 负载均衡器
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
