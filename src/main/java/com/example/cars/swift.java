package com.example.cars;

import com.example.interfaces.car;
import com.example.interfaces.engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class swift implements car {

    @Autowired
    @Qualifier("V6Engine")
    engine engine;

    @Override
    public String specs() {
        return "swift specs" + engine.type();
    }
}
