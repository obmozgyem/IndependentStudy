package com.walking.Lesson13.Task2.Model;

public class Cat extends Animal {

    private String colour;

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, String colour) {
        super(name);
        this.colour = colour;
    }

    private void meow() {
        System.out.println("meow");

    }

    @Override
    public void sound() {
        meow();
    }
}
