package com.spring.springLearning.pojo;

import jakarta.persistence.Id;
import org.springframework.stereotype.Component;


public class Trainer {

    private Integer empId;
    private String name;
    private Integer age;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Trainer (String name, Integer empId , Integer age){
        this.name=name;
        this.empId=empId;
        this.age=age;
    }

}
