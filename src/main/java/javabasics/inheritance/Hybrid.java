package javabasics.inheritance;


class grandfath{ // GrandFather
    public void displayGF(){
        System.out.println("Grand Father");
    }
}
class fath extends grandfath{ //Father // Single Inheritance
    public void displayF(){
        System.out.println("Father");
    }
}

class so extends fath { // Son // Hirarchical Inheritance
    public void displayS(){
        System.out.println("Son");
    }
}

class daught extends fath { //Daughter // Hirarchical Inheritance
    public void displayD(){
        System.out.println("Daughter");
    }
}

public class Hybrid {

    public static void main(String[] args) {
        so sonRef = new so();
        sonRef.displayGF();
        sonRef.displayF();
        sonRef.displayS();

        daught daugherRef = new daught();
        daugherRef.displayGF();
        daugherRef.displayF();
        daugherRef.displayD();
    }

}
