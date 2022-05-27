package classroom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Antons JAVA 1 Lekcija");
        int x = 5;
        int y = 10;
        int q = -10;

        double temperature = -17.7;
        //float beigās burts "F"
        float highTemperature = 40.65F;

        //byte robežas no -128 ... +128
        byte age = 10;

        //lieliem cipariem 2^68, un pēc tam beigās burts "L"

        long USACountryDebt = 999999999L;


        //komentārs
        System.out.println("x ir vienads ar:");
        System.out.println(x);
        System.out.println("y ir vienads ar:");
        System.out.println(y);
        System.out.println("x+y ir vienads ar:");
        System.out.println(x+y);

        //(Mainīga tips)  (mainīga nosaukums) = (Vertība)

        //Vārdi un teikumi JAVA valodā tiek saglabāti mainīgā tipā "String"
        String dogName = "Reksis";
        //Veseli skaitli tiek definēti ar mainīgā tipu "int"
        int dogAge = 5;
        //Daļskaitli tiek definēti ar manīgā tipu "double" vai "float"
        double dogWeigth = 15.5;
        String dogBreed = "VAS";
        //Jā vai Nē tiek definēts ar Mainīgā tipu "boolean"
        boolean isDogHungry = true;
        //vienu simbolu definē ar mainīgā tipu "char"
        char currency ='$';
        char dogGender ='M';
        int dogPrice = 100;




                System.out.println("Suņa Vārds: " + " " + dogName);
        System.out.println("Suņa vecums: " + dogAge);
        System.out.println("Suņa svars: " + dogWeigth);
        System.out.println("Suņa šķirne: " + dogBreed);
        System.out.println("Vai suns ir izsalcis: " + isDogHungry);
        System.out.println("Suņa dzimums ir: " + dogGender);
        System.out.println("Suņa kucēni maksā: " + dogPrice + currency);

        int summa;
        int pirmaisSkaitlis = 20;
        int otraisSkaitlis = 10;

        //summa = pirmaisSkaitlis + otraisSkaitlis;
        //System.out.println(pirmaisSkaitlis + " + " + "(" + otraisSkaitlis + ")" + " = " + summa);
        //System.out.println(pirmaisSkaitlis + " + " + "(" + otraisSkaitlis + ")" + " = " + summa);
        int starpiba = pirmaisSkaitlis - otraisSkaitlis;
        summa = pirmaisSkaitlis + otraisSkaitlis;
        int dalijums = pirmaisSkaitlis / otraisSkaitlis;
        int reizinajums = pirmaisSkaitlis * otraisSkaitlis;
        int atlikums = pirmaisSkaitlis % otraisSkaitlis;

        int a = 1;
        int b = 4;
        int c = 7;

        int vienadojums = 5+5*2;
        int vienadojums2 = (5+5)*2;
        int vienadojums3 = -(5+5)*2;

        //System.out.println("Ja atlikums ir 0, tad para skaitlis " + a%2);
        //if(b % 2 == 0){
        //     System.out.println("šis ir para skaitlis " + starpiba);
        // } nepabeigts

        System.out.println("starpiba " + starpiba);
        System.out.println("summa " + summa);
        System.out.println("reizinajums " + reizinajums);
        System.out.println("atlikums " + atlikums);



    }
}
