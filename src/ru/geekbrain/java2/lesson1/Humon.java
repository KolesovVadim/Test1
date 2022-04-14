package ru.geekbrain.java2.lesson1;

public class Humon implements Participants {
    private String name;

    public Humon(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 8;
    }

    @Override
    public int jump() {
        return 2;
    }
}

