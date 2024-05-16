package com.example.demo.web;

import com.example.demo.core.properties.AppProperties;
import com.example.demo.core.service.DemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class DemoController {
    private final AppProperties appProperties;
    private final DemoService demoService;

    @GetMapping("/runtime")
    public String getRuntimeTimes() {
        return demoService.getRuntimeTimes();
    }

    @GetMapping("/")
    public String home() {
        log.info("Current environment is {}", appProperties.getEnv());
        log.info("Current application name is {}", appProperties.getAppName());
        return "Welcome to demo web application!\n" +
                "Current environment is " + appProperties.getEnv() + "\n" +
                "Current application name is " + appProperties.getAppName() + "\n";
    }
}
