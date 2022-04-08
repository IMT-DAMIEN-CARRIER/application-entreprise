package com.ema.tp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Tp2Application {
	public static void main(String[] args) {
		SpringApplication.run(Tp2Application.class, args);
	}
}
