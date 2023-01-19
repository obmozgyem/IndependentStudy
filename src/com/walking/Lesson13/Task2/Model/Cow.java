package com.walking.Lesson13.Task2.Model;

public class Cow extends Animal {

   private boolean isABoy = true;

    public Cow(String name, boolean isABoy) {
        super(name);
        this.isABoy = isABoy;
    }

    private void moo() {
        System.out.println("moo");

    }
    @Override
    public void sound() {
        moo();
    }
}
