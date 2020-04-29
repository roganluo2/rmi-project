package com.example.rmi.provider.service.impl;

import com.example.rmi.provider.service.HelloRmiService;
import org.springframework.stereotype.Service;

@Service
public class HelloRmiServiceImpl implements HelloRmiService {
    @Override
    public int getAdd(int a, int b) {
        System.out.println("接收到请求" + a + "+" + b);
        return a + b;
    }
}
