package BasicsPractice;

import java.util.Scanner;

public class OddEven {

public static void main(String [] args)  {
    int a;
    System.out.println("Please enter a number");
    Scanner scn = new Scanner(System.in);
    a = scn.nextInt();
    if(a%2==0){
        System.out.println(a+" is even");
    }
    else{
        System.out.println(a+" is odd");
    }
}
}