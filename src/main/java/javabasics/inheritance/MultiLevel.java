package javabasics.inheritance;

class GrandFather {
    public void displayGrandFather(){
        System.out.println("Grandfather");
    }
}

class Father extends GrandFather {
    public void displayFather(){
        System.out.println("Father");
    }
}

class Son extends Father{
    public void displaySon(){
        System.out.println("Son");
    }

    public static void main(String[] args) {
        Son objRef = new Son();
        objRef.displaySon();
        objRef.displayFather();
        objRef.displayGrandFather();
    }
}


