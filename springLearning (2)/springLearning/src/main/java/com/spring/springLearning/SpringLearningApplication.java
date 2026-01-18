package com.spring.springLearning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//import java.util.logging.Logger;


@SpringBootApplication
public class SpringLearningApplication {

Logger logger= LoggerFactory.getLogger(SpringLearningApplication.class);
	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringLearningApplication.class, args);
	}
}
