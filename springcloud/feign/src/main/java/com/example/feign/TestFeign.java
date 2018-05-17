package com.example.feign;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",fallback = TestFeignImpl.class)
public interface TestFeign {
    @RequestMapping("/hi")
    String getHiMethod(@RequestParam("name")String name);
    @RequestMapping("/json")
    String getJsonMehtod( JSONObject jsonObject);
}
