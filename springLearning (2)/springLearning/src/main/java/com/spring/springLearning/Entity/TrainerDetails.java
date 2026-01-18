package com.spring.springLearning.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trainer_details")
public class TrainerDetails {


    @Column(name="name")
    private String name;

    @Id
    @Column(name="empId")
    private Integer empId;

    @Column(name="age")
    private Integer age;

    public TrainerDetails(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
