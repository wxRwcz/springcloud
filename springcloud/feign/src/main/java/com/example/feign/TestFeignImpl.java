package com.example.feign;

import org.springframework.stereotype.Component;

@Component
public class TestFeignImpl implements TestFeign {

    @Override
    public String getHiMethod(String name) {
        return "错误了，"+name;
    }
}
