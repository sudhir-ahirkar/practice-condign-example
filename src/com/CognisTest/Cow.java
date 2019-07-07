package com.CognisTest;

public class Cow extends Animal {
    public Cow(boolean isMammal, boolean isCarnivorous) {
        super(isMammal, isCarnivorous);
    }

    @Override
    public String getGreeting() {
        return "moo";
    }
}
