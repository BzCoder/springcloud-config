package com.bzcoder.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BaoZhou
 * @date 2018/8/30
 */
@RestController
public class ConfigController {
    @Value("${env}")
    private String env;

    @GetMapping("/env")
    public String getEnv()
    {
        return env;
    }

}
