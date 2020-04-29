package com.example.rmi.consumer;

import com.example.rmi.consumer.service.HelloRmiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class RmiConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(RmiConsumerApplication.class, args);
        HelloRmiService myClient = run.getBean("myClient", HelloRmiService.class);
        int add = myClient.getAdd(10, 20);
        log.info("result:" + add);

    }

}
