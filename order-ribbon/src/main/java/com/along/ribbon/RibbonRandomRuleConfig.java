package com.along.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: Ribbon配置
 * @Author along
 * @Date 2023/12/16 14:08
 */
@Configuration
public class RibbonRandomRuleConfig {

    @Bean
    public IRule iRule() {// 方法名一定要交iRule
        return new RandomRule();

    }
}
