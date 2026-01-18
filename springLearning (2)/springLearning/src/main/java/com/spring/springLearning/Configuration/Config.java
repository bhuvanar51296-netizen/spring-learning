package com.spring.springLearning.Configuration;

import com.spring.springLearning.Service.CalculatorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {


    @Bean
    public RestTemplate createNewRestTemplate(){
        return new RestTemplate();
    }
    @Bean("CS1")
    public CalculatorService newCal(){
        return new CalculatorService(400);
    }
}


