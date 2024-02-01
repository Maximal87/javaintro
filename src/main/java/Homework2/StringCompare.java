package Homework2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first String");
        String str1 = scanner.nextLine();
        System.out.println("Please enter second String");
        String str2 = scanner.nextLine();
//      boolean equals = str1.equals(str2);
//      System.out.println(equals);
        if (str1.equals(str2)){
            System.out.println("The two Strings are equal");
        } else {
            System.out.println("The two Strings are not equal");
        }
    }
}
