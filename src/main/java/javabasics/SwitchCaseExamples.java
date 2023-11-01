package javabasics;

import java.util.Scanner;

public class SwitchCaseExamples {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int age = scan.nextInt();
        if(age != 0) {
            if (age < 18) {
                System.out.println("Not Eligible for VOTE");
            } else if (age > 18 && age < 125) {
                System.out.println("Eligible for VOTE");
            } else {
                System.out.println("Invalid");
            }
        }else{
            System.out.println("Please Enter the Valid Age");
        }


    }
}
