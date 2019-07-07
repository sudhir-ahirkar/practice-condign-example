package com.CognisTest;

class Dog extends Animal {

    boolean isMammal;
    boolean isCarnivorous;

    public Dog(boolean isMammal, boolean isCarnivorous) {
        super(isMammal, isCarnivorous);
    }

    /*public Dog() {
        this.isMammal=false;
        this.isCarnivorous=true;

        super(this.isMammal, this.isCarnivorous);
    }
*/

    @Override
    public String getGreeting() {
        return "ruff";
    }
}
