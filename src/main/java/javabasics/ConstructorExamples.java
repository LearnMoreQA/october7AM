package javabasics;

public class ConstructorExamples {

   //static int x = 5, y = 7;

   static int c,d;

    public ConstructorExamples(int x, int y){
       c = x;
       d = y;
    }

    public ConstructorExamples(){

    }

    public int addValue(int a, int b){
        int result = a+b;
        return result;
    }

    public void addValue(int a, int b, int c){

    }


    public static void main(String[] args) {
        ConstructorExamples ref = new ConstructorExamples(5,7); // Constructor method
        System.out.println(ref.addValue(c,d)); // 12
        ConstructorExamples ObjRef = new ConstructorExamples();
    }

}
