package com.boot1.boot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/api")

public class BootSampleController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/hello")
    public String boot1Request() {

        String restCall = restTemplate.getForObject("http://localhost:8081/api/hello", String.class);
        System.out.println();
        return "Hello World";
    }

}
