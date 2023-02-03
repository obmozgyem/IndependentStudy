package com.walking.Lesson16_abstract.Task2.model;

public class UnknownAnswer implements Answer {
    @Override
    public String getAnswer() {
        return "Unknown message";
    }
}
