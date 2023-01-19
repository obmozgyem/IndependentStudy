package com.walking.Lesson13.Task1.model;

public class Dog extends Animal {
    String color;

    public Dog(String color) {
        this.color = color;
        System.out.printf("I’m %s a dog", color);
        System.out.println();
    }

    private Dog() {
        System.out.println("I’m a dog");
    }
}
