package com.along.order.interceptor.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 自定义feign拦截器
 * @Author along
 * @Date 2023/12/16 16:17
 */
public class CustomFeignInterceptor implements RequestInterceptor {
    Logger logger = LoggerFactory.getLogger(CustomFeignInterceptor.class);

    @Override
    public void apply(RequestTemplate requestTemplate) {
        logger.info("feign拦截器");
        // 对请求进行处理
        requestTemplate.header("custom-header", "custom-value");

    }
}
