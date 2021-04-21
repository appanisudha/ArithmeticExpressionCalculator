package com.arithmetic.expression;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.arithmetic.expression.*")
public class ArithmeticExpressionApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ArithmeticExpressionApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ArithmeticExpressionApplication.class);
	}

}
