package com.CognisTest;

public class TestAnimal {
    public static void main(String[] args) {

        Animal dog=new Dog(true,true);
        dog.printAnimal("Dog");



        Animal cow=new Cow(true,false);
        cow.printAnimal("Cow");


        Animal duck=new Duck(false,false);
        duck.printAnimal("Duck");
    }
}
