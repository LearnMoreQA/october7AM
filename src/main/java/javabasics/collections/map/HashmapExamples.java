package javabasics.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashmapExamples {

    public static void main(String[] args) {

        Map<Integer, String> details = new HashMap<>();

        details.put(600001,"Chennai"); // Entry
        details.put(630002,"Erode");
        details.put(632006,"Salem");
        details.put(620005,"Madurai");
        details.put(null,"theni");
        details.put(null,"coimbatore");

        System.out.println("HashMap : "+ details);

        System.out.println(details.get(620005));  // Madurai

        System.out.println(details.containsKey(630004)); // false

        System.out.println(details.isEmpty()); // false

        System.out.println(details.keySet()); //6100001,630002,632006,620005
        System.out.println(details.values()); //Chennai,Erode,Salem,Madurai
        System.out.println(details.entrySet());  //600001=Chennai, 630002=Erode, 620005=Madurai, 632006=Salem
        details.clear();
        System.out.println(details);

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1,"Mahesh");
        map.put(4,"Ravi");
        map.put(3,"Naresh");
        map.put(2,"Suresh");

        System.out.println("Linked Hash Map : "+map);

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2,"Suresh");
        treeMap.put(1,"Mahesh");
        treeMap.put(4,"Ravi");
        treeMap.put(3,"Naresh");


        System.out.println("Tree Map : " +treeMap);
    }
}
