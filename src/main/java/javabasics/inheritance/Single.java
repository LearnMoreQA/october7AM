package javabasics.inheritance;


class Child extends Parent {
    String str = "Learn  More";

    public void welcome(){
        System.out.println("Child");
    }

    public static void method(){
        System.out.println("Static");
    }
}

class Parent {

    int x = 100;

    public void msg(){
        System.out.println("Parent");
        //welcome();
    }
}
public class Single {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.x);
        child.msg();
        System.out.println(child.str);
        child.welcome();
        Child.method();
        /*Child child = new Child();
        System.out.println(child.str);
        child.welcome();*/
    }
}
