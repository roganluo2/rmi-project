package com.example.rmi.httpinvokerconsumer.configuration;

import com.example.rmi.httpinvokerconsumer.service.HttpInvokerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

@Configuration
public class ConsumerConfiguration {

    @Bean
    public HttpInvokerProxyFactoryBean remoteServiceFactory()
    {
        HttpInvokerProxyFactoryBean factoryBean = new HttpInvokerProxyFactoryBean();
        factoryBean.setServiceUrl("http://localhost:8080/hit");
        factoryBean.setServiceInterface(HttpInvokerService.class);
        return factoryBean;
    }

    @Bean
    public HttpInvokerService remoteService()
    {
        return (HttpInvokerService) remoteServiceFactory().getObject();
    }

}
