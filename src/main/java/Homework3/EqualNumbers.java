package Homework3;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int large;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number one");
        a = scanner.nextInt();
        System.out.println("Please enter number two");
        b = scanner.nextInt();
        System.out.println("Please enter number three");
        c = scanner.nextInt();
        large = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("The largest number is " + large);
    }
}
