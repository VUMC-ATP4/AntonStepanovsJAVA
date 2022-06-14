package homework;

import java.math.BigDecimal;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("This is homework");
        System.out.println();

        String country = "Spain";
        double population = 47.45;
        int totalArea = 505990;
        String capital = "Madrid";
        String officialLanguage = "Spanish";
        boolean ifInEu = true;
        char currency ='€';


        System.out.println("Country: " + country);
        System.out.println("Population: " + population + " million");
        System.out.println("Area: " + totalArea + " km2");
        System.out.println("Capital: " + capital);
        System.out.println("Official language: " + officialLanguage);
        System.out.println("Member of the EU?: " + ifInEu);
        System.out.println("Currency: " + currency);

        System.out.println(" ");

        System.out.println(country + "'s capital and largest city is " + capital+".");
        System.out.println(country + "'s population exceeds " + population + " million" + ".");
        System.out.println(officialLanguage + " is the world's second-most spoken native language.");
        System.out.println("With an area of " + totalArea + " " + country+ " is the largest country in Southern Europe.");

        System.out.println(" ");

        int a = 450;
        int b = 200;
        int c = 150;
        double d = 50.50;

        System.out.println("addition");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(b + " + " + c + " = " + (b + c));
        System.out.println(c + " + " + d + " = " + (c + d));

        System.out.println(" ");
        System.out.println("multiplication");
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(b + " * " + c + " = " + (b * c));
        System.out.println(c + " * " + d + " = " + (c * d));

        System.out.println(" ");
        System.out.println("subtraction");
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(b + " - " + c + " = " + (b - c));
        System.out.println(c + " - " + d + " = " + (c - d));

        System.out.println(" ");
        System.out.println("division");
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(b + " / " + c + " = " + (b / c));
        System.out.println(String.format(c + " / "+ d + " = %.2f", (c / d)));


        System.out.println(" ");
        System.out.println("modulo");
        System.out.println(a + " % " + b + " = " + (a % b));
        System.out.println(b + " % " + c + " = " + (b % c));
        System.out.println(c + " % " + d + " = " + (c % d));

    }
}
