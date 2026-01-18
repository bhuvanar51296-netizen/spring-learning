package com.spring.springLearning.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("CS")

public class CalculatorService implements CalciInterface {

//    public int price;

    public CalculatorService(int price) {
//        this.price=price;
    }

    public CalculatorService(){
    }

    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
}

