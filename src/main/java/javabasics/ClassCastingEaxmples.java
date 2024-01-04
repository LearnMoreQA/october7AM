package javabasics;

class P {

    public void msg(){
        System.out.println("Hi");
    }

}

class C extends P {
    public void welcome(){
        System.out.println("Learn More");
    }
}

public class ClassCastingEaxmples {

    public static void main(String[] args) {
        P parentRef = new C(); //Implicit Upcasting
        P pRef = (P)new C(); // Explicit Upcasting

        pRef.msg(); // Conversion to Parent Class Obj

        C cRef = (C)new P(); //Down casting // Only Explicit
        cRef.msg();
        cRef.welcome(); // Conversion from Parent to Child Class Obj
    }






}
