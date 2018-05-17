package com.example.feign;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {
    @Autowired
    TestFeign testFeign;
    @RequestMapping("/hi")
    @ResponseBody
    public String sayHi(@RequestParam String name){
        return testFeign.getHiMethod(name);
    }
    @RequestMapping("/json")
    @ResponseBody
    public String getJSON(JSONObject params){
        params.put(" 1","2");
        params.put(" 2","2");
        params.put(" 3","2");
        params.put(" 4","2");
        return testFeign.getJsonMehtod(params);
    }
    @RequestMapping("/html")
    public String getHtml(){
        return "POST";
    }
}
