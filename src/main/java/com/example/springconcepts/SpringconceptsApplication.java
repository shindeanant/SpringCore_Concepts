package com.example.springconcepts;

import com.example.springconcepts.component.DemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class SpringconceptsApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Spring concept Demo");
		ApplicationContext context = SpringApplication.run(SpringconceptsApplication.class, args);
		System.out.println("Checking Context: " +context.getBean(DemoBean.class) );
	}

}
