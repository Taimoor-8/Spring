package com.example.spring;

import com.example.cars.corolla;
import com.example.cars.swift;
import com.example.specs.V6Engine;
import com.example.specs.V8Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class AppConfig {

    @Bean("corolla")
    public corolla corolla(){
        return new corolla();
    }

    @Bean("swift")
    public swift swift(){
        return new swift();
    }

    @Bean("V8Engine")
    public V8Engine V8Engine(){
        return new V8Engine();
    }

    @Bean("V6Engine")
    public V6Engine V6Engine(){
        return new V6Engine();
    }
}
