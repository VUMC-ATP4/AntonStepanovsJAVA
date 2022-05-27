package classroomTwo;

public class Metodes {

    public static void main(String[] args) {
        System.out.println("Sākās koda izpilde");
        printetTekstu();
        System.out.println("Beidzās koda izpilde");
        printetTekstu();
        printetTekstu();
//        switchPiemers();
//        checkPersonAge();
//        checkPersonAge();
//        checkPersonAge();
        int a =10;
        int b = 50;
        int laukums =  calculateArea(a,b);
        System.out.println(laukums);


    }

    static int calculateArea(int a, int b){
        return a*b;
    }





    static void printetTekstu(){
        System.out.println("Šī ir mana metode");
        System.out.println("Es izsaucu šo metodi");
    }
}
