package javabasics.inheritance;

class father {
    public void showF(){
        System.out.println("Father");
    }
}
class son extends father {
    public void showS(){
        System.out.println("Son");
    }
}

class daughter extends father {
    public void showD(){
        System.out.println("Daughter");
    }
}

public class Hirarchal{
    public static void main(String[] args) {
        son ref = new son();
        ref.showF();
        ref.showS();

        daughter objRef = new daughter();
        objRef.showF();
        objRef.showD();
    }
}


