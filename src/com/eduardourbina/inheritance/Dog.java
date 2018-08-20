package com.eduardourbina.inheritance;

public class Dog extends Animal {
    public Dog(){
        super(true, true);
    }

    @Override
    public String getGreeting() {
        return "ruff";
    }
}
