package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",fallback = TestFeignImpl.class)
public interface TestFeign {
    @RequestMapping("/hi")
    String getHiMethod(@RequestParam("name")String name);
}
