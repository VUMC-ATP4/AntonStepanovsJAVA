package classroomTwo;

public class UzdevumsVizitkartes {

    public static void main(String[] args) {
        printetVizitkarti("Antons", "Stepanovs", "+371 12345678", 1989);

        luksafors("sarkana");

        printetVizitkartiReturn("John", "Doe", "+371 87654321", 1990);

       // String jaunaKarte = printetVizitkartiReturn;
    }

    public static void luksafors(String krasa){
        if(krasa.equals("sarkana")){
            System.out.println("STOP!");
        } else if(krasa.equals("zaļa")) {
            System.out.println("Ej!");
        } else if (krasa.equals("dzeltana")){
                System.out.println("Gatavojies");
            }
            else {
            System.out.println("Tāda krāsa nav luksoforā!");
        }
        }

        //static void luksaforsDivi



    static void printetVizitkarti(String name, String surname, String phoneNumber, int birthDate) {

        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: " + name );
        System.out.println("Uzvārds: " + surname );
        System.out.println("Telefona numurs: +371" + phoneNumber );
        System.out.println("Dzimšanas gads: " + birthDate );
        System.out.println("##########");

    }

    static String printetVizitkartiReturn(String name, String surname, String phoneNumber, int birthDate) {
        return "Vārds: " + name + "\nUzvārds: " + surname + "" + "\nTelefona nr: " + phoneNumber + "\nDzimšanas gads: " + birthDate + "\n##########";}


    }

