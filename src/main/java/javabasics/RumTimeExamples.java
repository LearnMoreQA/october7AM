package javabasics;


class shoppingAppV1 {
    public void payment(){
        System.out.println("Cash On Delivery");
    }
}

class shoppingAppV2 extends shoppingAppV1  {
    public void payment(){
        System.out.println("UPI Payment");
    }
}

public class RumTimeExamples {

    public static void main(String[] args) {
        shoppingAppV1 versionOne = new shoppingAppV1();
        versionOne.payment(); // Cash On Delivery

        shoppingAppV2 versionTwo = new shoppingAppV2();
        versionTwo.payment(); // UPI Payment

        shoppingAppV1 objRef = new shoppingAppV2(); // Upcasting
        objRef.payment(); // UPI Payment


    }

}
