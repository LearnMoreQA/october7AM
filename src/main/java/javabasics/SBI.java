package javabasics;

public class SBI implements RBI{
    @Override
    public void aadhaarRequired() {
        System.out.println("Please Fill the Form");
    }

    @Override
    public void panRequired() {

    }

    public static void main(String[] args) {
        SBI sbiObj = new SBI();
        sbiObj.aadhaarRequired();
        sbiObj.panRequired();

        RBI rbiObj = new SBI();
        rbiObj.aadhaarRequired();
        rbiObj.panRequired();

         // ChromeDriver chDriver = new ChromeDriver();

         // Interface RefVar = ChromeDriver Object
         // WebDriver driver = new ChromeDriver();
    }
}
