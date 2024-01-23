package Homework;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {

        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("What is your Hobby");

        Scanner scanner1 = new Scanner(System.in);
        String hobby = scanner1.nextLine();

        System.out.println("Your name is " + name + " and your hobby is " + hobby + "." );

    }
}
