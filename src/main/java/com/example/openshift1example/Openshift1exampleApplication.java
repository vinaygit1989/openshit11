package com.example.openshift1example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class Openshift1exampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(Openshift1exampleApplication.class, args);
    }

    @GetMapping("/")
    public String  welcome(){
        return " Hello Welcome to practice club";

    }

    @GetMapping("/input")
    public String  congrats(@PathVariable String input){
        return "Congratulations +" + input + "Open shift deployed successfully";

    }

}
