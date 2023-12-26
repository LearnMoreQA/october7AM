package javabasics.Abstraction;

public class abs extends abstractionExamples implements InterfaceExamples,example {

    @Override
    public void multiply() {
        int result = 3 * 6;
    }
    @Override
    public void sum() {
        System.out.println("Sum Method");
    }

    @Override
    public void divide() {
        System.out.println("Divide Method");
    }

    public static void main(String[] args) {
        abstractionExamples as = new abs();
        as.multiply();
        as.addvalue();

        example ex = new abs();
        ex.sum();
    }
}
