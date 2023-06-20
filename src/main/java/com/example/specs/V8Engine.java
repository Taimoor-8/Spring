package com.example.specs;

import com.example.interfaces.engine;

public class V8Engine implements engine {
    @Override
    public String type() {
        return "V8 engine";
    }
}
