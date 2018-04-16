package com.example.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestFeign testFeign;
    @RequestMapping("/hi")
    public String sayHi(@RequestParam String name){
        return testFeign.getHiMethod(name);
    }
}
