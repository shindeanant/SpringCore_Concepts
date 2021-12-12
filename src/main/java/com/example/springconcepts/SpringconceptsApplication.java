package com.example.springconcepts;

import org.slf4j.LoggerFactory;

import com.example.springconcepts.component.DemoBean;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringconceptsApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringconceptsApplication.class);
	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concepts Demo");
		ApplicationContext context = SpringApplication.run(SpringconceptsApplication.class, args);
		logger.debug("Checking Context: {}"+context.getBean(DemoBean.class));
		logger.debug("\n*** Example Using @Autowire annotation on property ***");

		
	}

}
