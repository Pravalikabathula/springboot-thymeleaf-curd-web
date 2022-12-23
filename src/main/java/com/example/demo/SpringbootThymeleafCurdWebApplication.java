package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")
public class SpringbootThymeleafCurdWebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder bulider) {
		return bulider.sources(SpringbootThymeleafCurdWebApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootThymeleafCurdWebApplication.class, args);
		System.out.println("Department table is created");
	}

}
