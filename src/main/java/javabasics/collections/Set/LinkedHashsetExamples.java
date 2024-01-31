package javabasics.collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetExamples {

    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        linkedHashSet.add(6);



        System.out.println(linkedHashSet);
    }
}
