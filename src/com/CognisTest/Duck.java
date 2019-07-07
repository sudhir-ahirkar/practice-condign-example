package com.CognisTest;

public class Duck extends Animal {
    public Duck(boolean isMammal, boolean isCarnivorous) {
        super(isMammal, isCarnivorous);
    }

    @Override
    public String getGreeting() {
        return "quack";
    }
}
