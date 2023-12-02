package BasicsPractice;

import java.util.Locale;
import java.util.Scanner;

public class Vowel {
    public static void main(String [] Args){
        String Alpha = "A";
        String Vowels = "aeiou";
        System.out.println("Enter the Alphabet");
        Scanner scn = new Scanner(System.in);
        Alpha = scn.next();
        if(Vowels.contains(Alpha.toLowerCase())){
            System.out.println(Alpha+" is Vowel");
        }
        else{
            System.out.println(Alpha+" is Consonant");
        }
    }
}