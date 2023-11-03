import java.util.Scanner;

public class ForLoopPtrn {
    public static void main(String[] args) {
        int qNo;
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the question number");
        qNo=scn.nextInt();

        switch(qNo){
            case 1:
                System.out.println("1.Write a program to check whether a number is even or odd");
                int num,quent;
                System.out.println("Please enter the number");
                num=scn.nextInt();
                quent=num%2;
                if(quent==0) {
                    System.out.println("Entered number is even");
                }
                else {
                    System.out.println("Entered number is odd");
                }
                break;
            case 2:
                System.out.println("2.Write a program to input any alphabet and check whether it is vowel or consonant");
                System.out.println("Please enter the alphabet");
                String cr=scn.next();
                String ucr=cr.toUpperCase();
                String vow="AEIOU";
                if (vow.contains(ucr)){
                    System.out.println("Entered alphabet is a vowel");
                }
                else{
                    System.out.println("Entered alphabet is a consonant");
                }
                break;
            case 3:
                System.out.println("3.Write a program to print reverse alphabets from K to B");
                for (char j = 'k'; j >= 'b'; j--) {
                    System.out.print(j+" ");
                }
                break;
            case 4:
                System.out.println("4.Write a program to find the factorial value of any number");
                System.out.println("Please enter the number");
                int ftVal,ftNum=scn.nextInt();
                ftVal=1;
                do{
                    ftVal=ftVal*ftNum;
                    ftNum--;
                }while (ftNum>0);
                System.out.println("Factorial value of the number is "+ftVal);
                break;
            case 6:
                System.out.println("6.Write a program for the pattern below");
                int i,j,k=1;
                for(i=0;i<5;i++) {
                    for (j = 0; j <= i; j++) {
                        System.out.print(k+" ");
                        k++;
                    }
                    System.out.println();
                }
                break;
        }


    }
}
