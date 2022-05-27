package homeworkTwo;

import java.util.Scanner;

public class homeworkTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1.uzdevums");

        int x;

        System.out.print("a.");
        x = 10;
        System.out.println(x > 0);

        System.out.print("b.");
        x = 20;
        System.out.println(x < 0);

        System.out.print("c.");
        x = 6;
        System.out.println((5 < x) && (x <= 10));

        System.out.print("d.");
        x = 9;
        System.out.println(!(x <= 5) && (x < 10));

        System.out.print("e.");
        x = 7;
        System.out.println((x == 0) || (x == 10));

        System.out.print("f.");
        x = 7;
        System.out.println((x * x) > 10);

        System.out.println("");
        System.out.println("2.uzdevums");

        int monthNr;
        String monthName;

        System.out.println("Ievadiet mēneša numuru:");
        monthNr = scanner.nextInt();

        switch(monthNr) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Nepareizs mēneša numurs";
                break;

        }
        System.out.println(monthName);

        System.out.println("");
        System.out.println("3.uzdevums");

    }
}
