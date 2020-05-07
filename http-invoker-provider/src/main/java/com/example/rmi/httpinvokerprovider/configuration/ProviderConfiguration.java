package com.example.rmi.httpinvokerprovider.configuration;

import com.example.rmi.httpinvokerprovider.service.HttpInvokerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

@Configuration
public class ProviderConfiguration   {

    @Bean(name = "/hit")
    public HttpInvokerServiceExporter httpInvokerServiceExporter(HttpInvokerService httpInvokerService)
    {
        HttpInvokerServiceExporter httpInvokerServiceExporter = new HttpInvokerServiceExporter();
        httpInvokerServiceExporter.setService(httpInvokerService);
        httpInvokerServiceExporter.setServiceInterface(HttpInvokerService.class);
        return httpInvokerServiceExporter;

    }

}
