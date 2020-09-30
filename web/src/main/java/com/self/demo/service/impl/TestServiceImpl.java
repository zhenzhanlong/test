package com.self.demo.service.impl;

import com.self.demo.service.ITestService;

public class TestServiceImpl implements ITestService {
    @Override
    public String get(String name) {
        return "My name is " + name + ",from service.";
    }
}
