package com.app.impl.phone;

import com.netflix.discovery.EurekaNamespace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: Y.Z.Y
 * @Descriptions: 手机服务启动类
 * @Date: Created in 2022/4/17
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients
public class PhoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhoneApplication.class, args);
    }
}
