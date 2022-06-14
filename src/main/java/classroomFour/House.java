package classroomFour;

public class House {
    String ielasNosaukums;
    int majasNumurs;
    int stavuSkaits;
    int ieejuSkaits;
    int istabuSkaits;
    double platiba;
    int cena;
    boolean irStavvieta;
    int skatijumuSkaits;


    public double cenaKvadratmetra() {
        return cena/platiba; //return cena.cena/platiba;??
    }

    public void printetAdresi() {
        System.out.println("Mājas adrese ir: " + ielasNosaukums + "" + majasNumurs);
//        System.out.println("Mājas stāvu skaits ir: " + stavuSkaits);
//        System.out.println("Mājas ieeju skaits ir: " + ieejuSkaits);
//        System.out.println("Mājas istabu skaits ir: " + istabuSkaits);
//        System.out.println("Mājas platība ir: " + platiba);
//        System.out.println("Mājas cena ir: " + cena + "" + valuta);
//        System.out.println("Vai mājai ir stāvvieta: " + irStavvieta);
     }

        public void printetVisu() {
            printetAdresi();
            System.out.println("Māja: " +
                    "stavuSkaits=" + stavuSkaits +
                    ", ieejuSkaits=" + ieejuSkaits +
                    ", istabuSkaits=" + istabuSkaits +
                    ", platiba=" + platiba + "m^2" +
                    ", cena=" + cena +
                    ", cena par metru=" + cenaKvadratmetra() +
                    ", irStavvieta=" + irStavvieta +
                    '}');
        }
    }
