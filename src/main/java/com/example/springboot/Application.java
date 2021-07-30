package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@SpringBootApplication
@Import({HelloController.class})
public class Application extends SpringBootServletInitializer {

	@Bean
	public HandlerMapping handlerMapping() {
		return new RequestMappingHandlerMapping();
	}

	/*
	 * Create required HandlerAdapter, to avoid several default HandlerAdapter
	 * instances being created
	 */
	@Bean
	public HandlerAdapter handlerAdapter() {
		return new RequestMappingHandlerAdapter();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
