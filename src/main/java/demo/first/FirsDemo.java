package demo.first;

import java.util.Scanner;

public class FirsDemo {
    public static void main(String[] args){
        //this will print the text in the consol

        System.out.println("Hello World");

        //Adding Scanner
        Scanner scanner = new Scanner(System.in);

        //Adding gestures
        String userName = scanner.nextLine();

        //Printing name
        System.out.println("Hello " + userName + ". Good Evening!");

    }
}