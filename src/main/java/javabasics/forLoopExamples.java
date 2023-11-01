package javabasics;

public class forLoopExamples {
    public static void main(String[] args) {

        /*for(int i=0;i<=10;++i)
        {
            System.out.println(i);
        }*/

      /*  int i = 1;

        while (i<1) // Infinite
        {
            System.out.println("While Loop : "+ i);
            i++;
        }

        do{
            System.out.println("do While : "+ i);
            i++;
        }while(i<1);*/


        //Pattern Print i -> row  j -> column rowCount = 4

        int i,j,rowCount = 4;

        for (i=1; i <= rowCount; i++){ // Iterate the Row
            for (j=1; j <= i;j++ ){ // Iterate the Column
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
