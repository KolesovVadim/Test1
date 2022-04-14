package ru.geekbrain.java2.lesson1;

public class Cat implements Participants {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 3;
    }

    @Override
    public int jump() {
        return 6;
    }
}
