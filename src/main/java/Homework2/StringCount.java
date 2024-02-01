package Homework2;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write something");
        String wordCount = scanner.nextLine();
        int numCount = wordCount.split("\\s").length;
        System.out.println("Number of words is " + numCount);
    }
}
