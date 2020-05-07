package com.example.rmi.httpinvokerprovider.service.impl;

import com.example.rmi.httpinvokerprovider.service.HttpInvokerService;
import org.springframework.stereotype.Service;

@Service(value = "httpinvokerservice")
public class HttpInvokerServiceImpl implements HttpInvokerService {
    @Override
    public String getTestPo(String desp) {
        System.out.println("执行远程调用！！！");
        return "getTestPo" + desp;
    }
}
