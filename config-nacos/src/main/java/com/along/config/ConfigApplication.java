package com.along.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author along
 * @Date 2023/12/16 22:17
 */
@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ConfigApplication.class, args);
        while (true) {
            String name = applicationContext.getEnvironment().getProperty("user.name");
            String age = applicationContext.getEnvironment().getProperty("user.age");
            String common = applicationContext.getEnvironment().getProperty("user.common");
            System.out.println("name: " + name);
            System.out.println("age: " + age);
            System.out.println("common: " + common);
            TimeUnit.SECONDS.sleep(5);
        }
        // nacos客户端
    }
}
