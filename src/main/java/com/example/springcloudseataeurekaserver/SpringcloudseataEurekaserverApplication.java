package com.example.springcloudseataeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudseataEurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudseataEurekaserverApplication.class, args);
    }

}
