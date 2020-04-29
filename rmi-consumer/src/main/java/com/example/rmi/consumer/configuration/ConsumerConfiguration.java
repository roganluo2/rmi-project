package com.example.rmi.consumer.configuration;

import com.example.rmi.consumer.service.HelloRmiService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class ConsumerConfiguration {

    @Bean
    public RmiProxyFactoryBean myFactoryBean()
    {
        RmiProxyFactoryBean factoryBean = new RmiProxyFactoryBean();
        factoryBean.setServiceInterface(HelloRmiService.class);
        factoryBean.setServiceUrl("rmi://127.0.0.1:9999/helloRmi");
        return factoryBean;
    }

    @Bean
    public HelloRmiService myClient()
    {
        return (HelloRmiService) myFactoryBean().getObject();
    }

}
