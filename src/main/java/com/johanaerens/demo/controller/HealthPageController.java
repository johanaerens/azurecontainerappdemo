package com.johanaerens.demo.controller;

import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthPageController {

    private final BuildProperties buildProperties;

    public HealthPageController(BuildProperties buildProperties) {
        this.buildProperties = buildProperties;
    }

    @GetMapping(value = "/public/HealthPage")
    public Map<String, String> sayHello() {
        return Map.of(
                "status", "succeeded",
                "version", buildProperties.getVersion()
        );
    }
}
