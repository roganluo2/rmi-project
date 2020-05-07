package com.example.rmi.httpinvokerconsumer;

import com.example.rmi.httpinvokerconsumer.service.HttpInvokerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HttpInvokerConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(HttpInvokerConsumerApplication.class, args);
        HttpInvokerService remoteService = run.getBean("remoteService", HttpInvokerService.class);
        String dddd = remoteService.getTestPo("dddd");
        System.out.println(dddd);
    }

}
