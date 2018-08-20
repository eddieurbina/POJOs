package com.eduardourbina.inheritance;

public class Duck extends Animal {
    public Duck() {
        super(false,false);
    }

    @Override
    public String getGreeting(){
        return "quack";
    }
}
