package javabasics;

import javabasics.Encapulation.EncapsulationExamples;

public class accessModifiersExamples extends EncapsulationExamples {

    public static void main(String[] args) {
        EncapsulationExamples obj = new EncapsulationExamples();
        System.out.println(obj.name);
        obj.publicExample();

        accessModifiersExamples ref = new accessModifiersExamples();
        System.out.println(ref.name);
        System.out.println(ref.pi);
        ref.publicExample();
        ref.protectedExample();
    }
}
