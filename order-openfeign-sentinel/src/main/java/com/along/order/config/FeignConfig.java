package com.along.order.config;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: openFeign配置 全局配置
 * @Author along
 * @Date 2023/12/16 15:33
 */
@Configuration
public class FeignConfig {

    /**
     * 日志级别(不推荐这种配置方式)
     * @return
     */
    @Bean
    public Logger.Level feignLoggerLevel() {
        // return Logger.Level.NONE; // NONE：【性能最佳，适用于生产】不记录任何日志（默认值）
        // return Logger.Level.BASIC; // BASIC：【适用于生产环境追踪问题】仅记录请求方法、url、响应状态码及执行时间。
        // return Logger.Level.HEADERS; // HEADERS：记录basic级别日志的基础上，记录请求和响应的header
        return Logger.Level.FULL; // FULL：【比较适用于开发及测试环境定位问题】记录请求和响应的header、body和元数据
    }

    /**
     * 超时时间配置（不推荐这种配置方式）
     * @return
     */
    @Bean
    public Request.Options options() {
        return new Request.Options(5000, 10000);
    }
}
