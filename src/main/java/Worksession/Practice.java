package Worksession;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        int a = 5;
        int b = 15;
        int c = a + b;

        System.out.println(c);




        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();

            if (number > 50 && number < 500) {
                System.out.println("The number entered is maximum");
            } else if (number < 50 && number>1) {
                System.out.println("The number entered is minimum");
            } else {
                System.out.println("Enter the valid number");
            }
        }


    }

