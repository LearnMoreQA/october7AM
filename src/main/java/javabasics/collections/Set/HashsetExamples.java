package javabasics.collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetExamples {
    public static void main(String[] args) {
        Set<String> country = new HashSet<>();
        country.add("India");
        country.add("United States");
        country.add("United Kingdom");
        country.add("South Aferica");
        country.add("Austrlia");
        country.add(null);

        System.out.println("Added Hast Set :"+country);

        country.add("Austrlia"); // boolean -> false

        System.out.println("After Add Duplicate  :"+country);

        // Read or Get
        System.out.println("Get the Value based on Index : "+country.contains("United Kingdom"));

        // Delete or Remove
        country.remove("Austrlia");
        System.out.println("Remove from Hash Set : "+country);

        for (String countryVal:country) {
            if(countryVal.equals("India")){
                System.out.println(countryVal + " Country is presented in HashSet");
            }
        }

        Iterator setItr = country.iterator();

        while (setItr.hasNext()){
            System.out.println("Iteration : "+setItr.next());
        }

        country.clear();

        System.out.println("Remove All from HashSet : "+country);

    }
}
