package com.eduardourbina.inheritance;

public abstract class Animal {
    private boolean isMammal;
    private boolean isCarnivorous;

    public Animal (boolean isMammal, boolean isCarnivorous) {
        this.isMammal = isMammal;
        this.isCarnivorous = isCarnivorous;
    }

    public boolean getIsMammal(){
        return isMammal;
    }

    public boolean getIsCarnivorous() {
        return isCarnivorous;
    }

    abstract public String getGreeting();

    public void printAnimal (String name) {
        System.out.println(
                "A " + name + " says '" + this.getGreeting() + "', is" +
                        (this.getIsCarnivorous() ? " carnivorous" : " not carnivorous") +
                        " and is " + (this.getIsMammal() ? "a mammal" : "not a mammal")
        );
    }
}
