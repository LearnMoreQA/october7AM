package javabasics;

import java.util.Arrays;

public class StringExamples {

    public static void main(String[] args) {

       String s = new String("Learn");
        String name = s.concat("More");

        System.out.println(s);

        System.out.println(name);

        String str = "Learn More";

        System.out.println(str.charAt(2)); // A
        System.out.println(str.indexOf('r')); // 3
        System.out.println(str.lastIndexOf('r')); // 8

        System.out.println(str.toLowerCase()); // learn more
        System.out.println(str.toUpperCase()); // LEARN MORE

        String[] strArr = str.split(" "); // [Learn, More]
        System.out.println(Arrays.toString(strArr));



        String s1 = "LearnMore";
        String s2 = "LearnMore";

        String s3 = new String("LearnMore");
        String s4 = new String("LearnMore");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false

        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equalsIgnoreCase("learnmore")); // true

        char[] chArr = str.toCharArray();
        System.out.println(chArr);
        System.out.println(Arrays.toString(chArr));
        System.out.println(s4.contains("More"));

        System.out.println(s4.endsWith("More"));
        System.out.println(s4.startsWith("Lea"));

        String stringVal = " ";
        System.out.println("Blank value : " + stringVal.isBlank());
        System.out.println("Empty : "+ stringVal.isEmpty());

        String nameval = "    mahesh   waran   ";
        System.out.println(nameval);
        System.out.println(nameval.trim());

        StringBuffer sb = new StringBuffer("Learn");
        sb.append("More");
        System.out.println(sb);
        sb.charAt(0);


        StringBuilder stringBuilder = new StringBuilder("Learn");
        stringBuilder.append("More");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
