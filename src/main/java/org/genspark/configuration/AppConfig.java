package org.genspark.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

//@Configuration
//@ComponentScan(basePackages = "org.genspark.configuration")
public class AppConfig {

    @Bean
    public Student getStudent(){
        List<Phone> ph = new ArrayList<Phone>();
        ph.add(new Phone("1112223333"));
        ph.add(new Phone("4445556666"));

        Student student = new Student(
                5678, "Config", ph
        );
        return student;
    }
    @Bean
    public Address getAddress(){
        Address address = new Address(
                "New York City", "New York", "USA", "12345"
        );
        return address;
    }
}
