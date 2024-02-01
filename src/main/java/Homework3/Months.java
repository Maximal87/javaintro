package Homework3;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner months = new Scanner(System.in);
        System.out.println("Please enter Month number Between 1-12");
        int month = months.nextInt();
        System.out.println(getMonths(month));
    }
    public static String getMonths (int month) {
        String monthNames = "";
        switch (month) {
            case 1: monthNames = "January";
            break;
            case 2: monthNames = "February";
            break;
            case 3: monthNames = "March";
            break;
            case 4: monthNames = "April";
            break;
            case 5: monthNames = "May";
            break;
            case 6: monthNames = "June";
            break;
            case 7: monthNames = "July";
            break;
            case 8: monthNames = "August";
            break;
            case 9: monthNames = "September";
            break;
            case 10: monthNames = "October";
            break;
            case 11: monthNames = "November";
            break;
            case 12: monthNames = "December";
            break;
            default:
                System.out.println("Invalid input");
        }
        return monthNames;
    }

}
