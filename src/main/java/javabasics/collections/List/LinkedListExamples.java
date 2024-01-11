package javabasics.collections.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (Integer val : list){
            System.out.println(val);
        }



        // Read or Get
        System.out.println("Get the Value based on Index : "+list.get(2));

        // Update or Modify
        list.set(4,0);
        System.out.println("Updated Lined list : "+list);

        // Delete or Remove
        list.remove(4);
        System.out.println("Remove from Linked list : "+list);

        // Iterate using Iterator, We can use For and For Each loop also
        System.out.println(list);
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // Clear ArrayList
        list.clear();
        System.out.println("Clear ArrayList : "+ list);


    }
}
