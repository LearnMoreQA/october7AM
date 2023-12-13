package javabasics.inheritance;

public class Parent extends Child {

    int x = 100;

    public void msg(){
        System.out.println("Parent");
        //welcome();
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.x);
        parent.msg();
        System.out.println(parent.str);
        parent.welcome();
        method();

        /*Child child = new Child();
        System.out.println(child.str);
        child.welcome();*/
    }
}
