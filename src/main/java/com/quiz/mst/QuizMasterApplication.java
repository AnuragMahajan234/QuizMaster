package com.quiz.mst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class QuizMasterApplication extends SpringBootServletInitializer{

		 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	         return application.sources(QuizMasterApplication.class);
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(QuizMasterApplication.class, args);
	}

}
