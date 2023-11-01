package javabasics;

import java.util.Scanner;

public class conditionExamples {

    public static void main(String[] args) {
       /* int a = 5;
        int b = 7;

        if(a == b) // if (condition -> true)
        {
            System.out.println("Both Values are Equal");
        }
        else
        {
            System.out.println("Both values are Not Matched");
        }*/

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
