package javabasics;

public class StaticExample {

    static String name;
    int amount;

    public static void staticMethodExample(){
        StaticExample Ref = new StaticExample();
        Ref.message();
        System.out.println("Name : "+name); // We can't Use the Non-static Variable inside Static Method
    }

    public void message(){
        staticMethodExample(); // We can Call the Static Method inside Non-static Method
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        StaticExample.staticMethodExample();


        StaticExample staticRefVarOne = new StaticExample();
        name = "Learn";
        staticRefVarOne.amount = 100;
        staticRefVarOne.message();
        staticRefVarOne.staticMethodExample();

        StaticExample staticRefVarTwo = new StaticExample();
        name = "LearnMore";
        staticRefVarTwo.amount = 200;

        System.out.println("Object 1 Static Variable : "+staticRefVarOne.name); // Learn
        System.out.println("Object 1 Non Static Variable : "+staticRefVarOne.amount); // 100

        System.out.println("Object 2 Static Variable : "+staticRefVarTwo.name); // Learn More
        System.out.println("Object 2 Non Static Variable : "+staticRefVarTwo.amount); // 200




    }


}
