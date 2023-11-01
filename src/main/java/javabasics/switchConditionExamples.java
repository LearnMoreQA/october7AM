package javabasics;

public class switchConditionExamples {
    public static void main(String[] args) {
         int speed = 4;

        switch (speed) {
            case 1 -> { System.out.println("low");
            System.out.println("low");}
            case 2 -> System.out.println("medium");
            case 3 -> System.out.println("medium fast");
            case 4 -> System.out.println("fast");
            case 5 -> System.out.println("super fast");
            default -> System.out.println("provide the valid speed value");
        }

    }
}
