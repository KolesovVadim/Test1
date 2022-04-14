package ru.geekbrain.java2.lesson1;

public class mainApp {
    public static void main(String[] args) {
        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();
        Participants humon = new Humon("Vadim");
        Participants robot = new Robot("Valera");
        Participants cat = new Cat("Tomas");
        runningCheck(treadmill,humon,robot,cat);
        jumpChek(wall,humon,robot,cat);

    }

    private static void runningCheck(Treadmill treadmilli,Participants ...participants){
        for (Participants participant : participants) {
            System.out.println(participant + " Начал бежать");
            System.out.println(treadmilli.canRun(participant));
            System.out.println(" Зкончил бежать");
        }

        System.out.println();
    }

    private static void jumpChek(Wall wall,Participants ...participants){
        for (Participants participant : participants) {
            System.out.println(participant + " Начал прыгать");
            System.out.println(wall.canJump(participant));
            System.out.println("Закончил прыгать");
        }
    }




}
