package com.walking.Lesson13.Task1.model;

public class Cat extends Animal {
    String color;

    public Cat(String color) {
        this.color = color;
        System.out.printf("I’m %s a cat", color);
        System.out.println();
    }

    private Cat() {
        System.out.println("I’m a cat");
    }
}
