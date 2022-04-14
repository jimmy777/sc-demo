package com.app.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Y.Z.Y
 * @Descriptions:
 * @Date: Created in 2022/4/14
 */

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaClient
public class UAACloudApplication {

    public static void main(String[] args) {

        SpringApplication.run(UAACloudApplication.class, args);
    }
}
