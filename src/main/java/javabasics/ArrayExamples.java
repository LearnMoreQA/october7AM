package javabasics;

import java.util.Arrays;

public class ArrayExamples {

    public static void main(String[] args) {
        int marks[] = new int[5];

        marks[0] =59;
        marks[1] = 81;
        //marks[6] = 90;  ArrayIndexOutOfBoundsException

        String[] concepts = {"Selenium","Java","Cucumber"};

        System.out.println(Arrays.toString(marks));

        for (int i=0; i < concepts.length;i++){

            System.out.println("We are Going to Learn Below Concepts : "+concepts[i]);
        }

        // For Each Loop
        for(String concept : concepts){
            System.out.println("We are Going to Learn Below Concepts : "+concept);
        }

        String[][] name = new String[2][3];

        name[0][0] = "Webdriver";
        name[0][1] = "Selenium";
        name[0][2] = "Cucumber";

        name[1][0] = "Maven";
        name[1][1] = "Java";
        name[1][2] = "Pom";

        System.out.println(Arrays.deepToString(name));

        for (String[] val : name){
            for(String refVar : val)
            System.out.println("String Value :" + refVar);
        }


    }
}
