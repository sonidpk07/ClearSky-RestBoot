 package com.deepak.springapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.deepak.springapi.config.SwaggerConfig;
import com.deepak.springapi.config.WebConfig;

@SpringBootApplication
@Import({SwaggerConfig.class,WebConfig.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
