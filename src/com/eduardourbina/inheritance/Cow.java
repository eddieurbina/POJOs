package com.eduardourbina.inheritance;

public class Cow extends Animal{
    public Cow() {
        super(true,false);
    }

    @Override
    public String getGreeting() {
        return "moo";
    }
}
