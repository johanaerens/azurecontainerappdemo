package com.johanaerens.demo;

import com.microsoft.applicationinsights.attach.ApplicationInsights;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MessageProperties.class)
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationInsights.attach();
		SpringApplication.run(DemoApplication.class, args);
	}
}
