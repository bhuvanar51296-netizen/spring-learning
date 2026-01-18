package com.spring.springLearning.Controller;

import com.spring.springLearning.Service.CalciInterface;
import com.spring.springLearning.Service.CalculatorService;
import com.spring.springLearning.SpringLearningApplication;
import com.spring.springLearning.pojo.Trainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/main")
public class MainController {

    private Logger log= LoggerFactory.getLogger(MainController.class);


    @Autowired
    @Qualifier("CS1")
    private CalciInterface cs;

    @Autowired
    private RestTemplate rs;

    @GetMapping("/welcome")
    public String welcome(){
        log.info("Welcome method invoked");
        return "Welcome to application";
    }
    @PostMapping("/trainer")
    public Trainer saveTrainer(@RequestBody Trainer trainer){
        //jdbc,connection object, flush
//        repository(jpa) => Entity => database
      return trainer;
    }

    @GetMapping("/add/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b){
        int result=cs.add(a,b);
        return "The sum is :" + (a+b) ;
    }
    @GetMapping("/sub/{a}/{b}")
    public String sub(@PathVariable int a, @PathVariable int b){
        int result=cs.sub(a,b);
        return "The sub is :" + (a-b);
    }
}

