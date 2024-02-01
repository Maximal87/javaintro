package Homework3;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = numberInput.nextInt();
        if (number %2==0){
            System.out.println("The number is Even");
        }
        else System.out.println("The number is Odd");
    }
}
