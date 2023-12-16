package javabasics.Encapulation;

public class EncapsulationExamples {

    private int age = 24;

    public String name = "Learn More";

    protected  double pi = 3.14;

    char ch = 'c';

    public void publicExample(){
        System.out.println("Access Modifier : Public");
    }

    private void privateExample(){
        System.out.println("Access Modifier : Private");
    }

    protected void protectedExample(){
        System.out.println("Access Modifier : Protected");
    }

    void defaultExample(){
        System.out.println("Access Modifier : Default");
    }

    public static void main(String[] args) {
       EncapsulationExamples ex = new EncapsulationExamples();
        System.out.println(ex.age);
    }



}
