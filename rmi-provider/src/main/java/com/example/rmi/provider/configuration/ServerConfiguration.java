package com.example.rmi.provider.configuration;

import com.example.rmi.provider.service.HelloRmiService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
public class ServerConfiguration {

    @Bean
    public RmiServiceExporter myRmi(HelloRmiService helloRmiService) {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setService(helloRmiService);
        rmiServiceExporter.setServiceName("helloRmi");
        rmiServiceExporter.setServiceInterface(HelloRmiService.class);
        rmiServiceExporter.setRegistryPort(9999);
        return rmiServiceExporter;
    }

}
