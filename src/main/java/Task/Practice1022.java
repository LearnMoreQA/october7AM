package Task;


import java.util.Arrays;
import java.util.Scanner;

public class Practice1022 {

    public static void main(String[] args) {

//Even or odd
     /* Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter the number: ");
        number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        //Vowel or consonant
        char ch;
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character: ");
        ch = scan.next().charAt(0);


        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

            System.out.println("ch is vowel");
        } else {
            System.out.println("ch  is consonant");
        }


        //Factorial
        int n, fact = 1;
        scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = scan.nextInt();


        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of number " + n + " is " + fact);

// Reverse string

       char s;
        for(s='k';s>='a';s--)
        {
            System.out.print(s);
        }

 //pattern of numbers

        int i,j,rc=4;
        int pattern=1;

        for(i=0;i<=rc;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(pattern +" ");
                pattern++;
            }
            System.out.println();
        }*/

        //Array Task

        String [][] name= new String[2][3];


        name[0][0]="name1";
       name[0][1]="name2";

       name[1][0]="name3";
       name[1][1]="name4";
        System.out.println(Arrays.deepToString(name));


        int i,j;
        for(i=0;i<=name.length;i++)
        {
            for(j=0;j<=i;j++)
                System.out.println("result: ".toString());
}
}
