package javabasics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat formattedDate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("Formatted Date : "+formattedDate.format(date));
    }
}
