package com.example.spring;

import com.example.interfaces.car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);

        car myCar = context.getBean("swift" , car.class);
        System.out.println(myCar.specs());
        context.close();
    }

}
