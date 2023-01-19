package com.walking.Lesson13.Task2.Model;

public class Dog extends Animal {

    private int legth;

    public Dog(String name, int legth) {
        super(name);
        this.legth = legth;
    }

      private void woof() {
          System.out.println("woof");
      }

    @Override
    public void sound() {
        woof();
    }
}
