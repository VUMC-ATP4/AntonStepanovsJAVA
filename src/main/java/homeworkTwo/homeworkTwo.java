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


        int y;
        int z;

        System.out.println("Ievadiet pirmo veselo skaitli:");
        x = scanner.nextInt();
        System.out.println("Ievadiet otro veselo skaitli:");
        y = scanner.nextInt();
        System.out.println("Ievadiet trešo veselo skaitli:");
        z = scanner.nextInt();


        if (x > y && x > z) {
            System.out.println("Lielākais no ievadītiem skaitļiem: " + x);
        } else if (x < y && y > z){
            System.out.println("Lielākais no ievadītiem skaitļiem: " + y);
        } else {
            System.out.println("Lielākais no ievadītiem skaitļiem: " + z);
        }


        System.out.println("");
        System.out.println("4.uzdevums");

        String color;

        System.out.println("Ievadiet luksofora gaismas krāsu (sarkana, dzeltena vai zaļa):");
        color = scanner.next();

        if (color.equals("zaļa")) {
            System.out.println("Var šķērsot krustojumu!");
        } else if (color.equals("dzeltena")){
            System.out.println("Gatavojies šķērsot ielu!");
        } else if (color.equals("sarkana")){
            System.out.println("Nedrīkst šķērsot krustojumu, jāuzgaida!");
        }else {
            System.out.println("Lukfors nedarbojas, jāvadās Ceļu satiksmes noteikumos noteiktajā kārtībā!");
        }

        System.out.println("");
        System.out.println("5.uzdevums");
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        System.out.println("");
        System.out.println("6.uzdevums");
        printBusinessCardTwo("Antons", "Stepanovs", "+371 12345678", 1989);
        printBusinessCardTwo("Andris", "Bērziņš", "+371 87654321", 1979);



        System.out.println("");
        System.out.println("7.uzdevums");

        int a;
        int b;

        System.out.println("Ievadiet pirmo veselo skaitli:");
        a = scanner.nextInt();
        System.out.println("Ievadiet otro veselo skaitli:");
        b = scanner.nextInt();

        int summa =sum(a,b);

        System.out.println("Ievadīto skaitļu summma: " + summa);


        System.out.println("");
        System.out.println("8.uzdevums");

        double c;
        double d;
        double e;

        System.out.println("Ievadiet pirmo skaitli:");
        c = scanner.nextDouble();
        System.out.println("Ievadiet otro skaitli:");
        d = scanner.nextDouble();
        System.out.println("Ievadiet trešo skaitli:");
        e = scanner.nextDouble();

        double average = average(c,d,e);

        System.out.println("Ievadīto skaitļu vidēja vērtība: " + average);

    }



    static void printBusinessCard(){
        String name = "Antons";
        String surname = "Stepanovs";
        int phoneNumber = 12345678;
        int birthDate = 1989;

        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: " + name );
        System.out.println("Uzvārds: " + surname );
        System.out.println("Telefona numurs: +371" + phoneNumber );
        System.out.println("Dzimšanas gads: " + birthDate );
        System.out.println("##########");
    }

    private static void printBusinessCardTwo(String name, String surname, String phoneNumber, int birthDate) {

        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: " + name );
        System.out.println("Uzvārds: " + surname );
        System.out.println("Telefona numurs: " + phoneNumber );
        System.out.println("Dzimšanas gads: " + birthDate );
        System.out.println("##########");

    }

    static int sum(int a, int b){ return a+b;
    }

    static double average(double c, double d, double e){ return (c+d+e)/3;
    }



}
