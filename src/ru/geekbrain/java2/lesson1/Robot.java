package ru.geekbrain.java2.lesson1;

public class Robot implements Participants {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 10;
    }

    @Override
    public int jump() {
        return 4;
    }
}
