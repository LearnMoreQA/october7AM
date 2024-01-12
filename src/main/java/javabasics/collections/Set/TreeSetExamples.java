package javabasics.collections.Set;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {

    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(6);
        treeSet.add(7);

        System.out.println(treeSet);
    }
}
