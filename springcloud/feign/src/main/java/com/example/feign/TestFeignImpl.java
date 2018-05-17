package com.example.feign;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class TestFeignImpl implements TestFeign {

    @Override
    public String getHiMethod(String name) {
        return "错误了，"+name;
    }

    @Override
    public String getJsonMehtod(JSONObject jsonObject) {
        return null;
    }

}
