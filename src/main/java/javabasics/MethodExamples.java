package javabasics;

public class MethodExamples {

 String email = "abc@test.com";
    String pwd = "pass123";
    long mobNo = 9489739889l;

    public String register(String email,String password,long mobNo){
        //String email = "abc@gmail.com";
        System.out.println("First name Entered");
        System.out.println("Last name Entered");
        System.out.println("email Entered");
        System.out.println("mobil number Entered" + mobNo);
        System.out.println("password Entered" + password);
        return email;
    }

    public void login(String email){ // Parameter
        System.out.println("Email : "+ email);
    }


    public static void main(String[] args) {
        MethodExamples objRef = new MethodExamples();
        //System.out.println(objRef.email);
        String emailAddress = objRef.register(objRef.email, objRef.pwd, objRef.mobNo);
        objRef.login(emailAddress); // argument
    }
}
