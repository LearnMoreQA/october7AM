package javabasics.collections.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

    public static void main(String[] args) {

        // ArrayList Implementation

        List<Object> info = new ArrayList<>();
        info.add("John");
        info.add(26);
        info.add('M');
        info.add(1000.00);
        info.add("John");
        info.add(null);

        System.out.println("Without Generics : " + info);

        // Create or Add
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        languages.add("Ruby");

        System.out.println("With Generics : "+languages);

        // Read or Get
        System.out.println("Get the Value based on Index : "+languages.get(2));

        System.out.println("ArrayList Size :"+languages.size());

        // Update or Modify
        languages.set(3," C#");
        System.out.println("Updated ArrayList : "+languages);

        // Delete or Remove
        languages.remove(1);
        System.out.println("Remove from ArrayList : "+languages);

        // Clear ArrayList
        info.clear();
        System.out.println("Clear ArrayList : "+ info);


        //Iterate ArrayList
        for(int i=0;i< languages.size();i++){
            System.out.println(languages.get(i));
        }


    }


}
