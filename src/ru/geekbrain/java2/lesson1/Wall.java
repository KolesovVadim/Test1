package ru.geekbrain.java2.lesson1;

public class Wall {
    private int wigth = 5;

    public boolean canJump(Participants participants){
        int wigth = participants.jump();
        return wigth >= participants.jump();
    }
}
