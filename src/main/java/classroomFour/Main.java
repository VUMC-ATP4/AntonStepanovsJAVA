package classroomFour;

public class Main {
    public static void main(String[] args) {
        //objekts viens
        House majaViens = new House();
        majaViens.majasNumurs = 1;
        majaViens.ielasNosaukums = "Brīvības iela";
        majaViens.stavuSkaits = 2;
        Cena cena1 = new Cena();
        cena1.cena = 30000;
        cena1.valuta = '$';
        majaViens.cena = cena1.cena; ///cena1.cena??
        //majaViens.cena = 50000;
        majaViens.ieejuSkaits = 2;
        majaViens.irStavvieta = true;
        majaViens.istabuSkaits = 5;
        majaViens.platiba = 350;



        //objekts divi
        House majaDivi = new House();
        majaDivi.majasNumurs = 2;
        majaDivi.ielasNosaukums = "Ģertrūdes iela";
        majaDivi.stavuSkaits = 3;
        majaDivi.istabuSkaits = 4;
        majaDivi.ieejuSkaits = 2;
        majaDivi.platiba = 165.3;
        //majaDivi.cena = 100000; //never used, jo cena ir defineta zemak?
        majaDivi.irStavvieta = true;

        Cena cena2 = new Cena();
        cena2.cena = 100000;
        majaDivi.cena = cena2.cena; ///cena2.cena??




        majaViens.printetAdresi();
        majaDivi.printetAdresi();

        majaDivi.ielasNosaukums = "Izmainīts nosaukums ";
        majaDivi.printetAdresi();

        majaViens.printetVisu();
        majaDivi.printetVisu();

        majaDivi.skatijumuSkaits++;

        Velosipeds velosipeds1 = new Velosipeds();
        Velosipeds velosipeds2 = new Velosipeds();
        velosipeds2.bremzuTips = "Disku";
        velosipeds2.rataIzmers = 27.3;
        velosipeds2.spiedPedalus();
        velosipeds2.spiedPedalus();
        velosipeds2.spiedPedalus();
        System.out.println("Velosipēda 2 ātrums ir = " + velosipeds2.atrums);
        velosipeds2.bremze();
        velosipeds2.bremze();
        System.out.println("Velosipēda 2 ātrums ir = " + velosipeds2.atrums);
        System.out.println(velosipeds1.atrumi);
        System.out.println(velosipeds1.nosaukums);
        velosipeds1.atrumi = 28;
        System.out.println(velosipeds1.atrumi);

        System.out.println("Velosipēda ātrums ir = " + velosipeds1.atrums);
        velosipeds1.spiedPedalus();
        System.out.println("Velosipēda ātrums ir = " + velosipeds1.atrums);
        velosipeds1.spiedPedalus();
        velosipeds1.spiedPedalus();
        velosipeds1.spiedPedalus();
        velosipeds1.spiedPedalus();
        System.out.println("Velosipēda ātrums ir = " + velosipeds1.atrums);
        System.out.println("Priekšā ir gājējs");
        velosipeds1.bremze();
        System.out.println("Velosipēda ātrums ir = " + velosipeds1.atrums);
        velosipeds1.bremze();
        velosipeds1.bremze();
        velosipeds1.bremze();
        System.out.println("Velosipēda ātrums ir = " + velosipeds1.atrums);


        Auto testCar = new Auto("Opel", 1990, 200000, 500);
        Auto testCar2 = new Auto("BMW", 1991, 230000, 1000);
        testCar.printetParametrus();
        testCar.autoVecums();

        Zivs zivsViens = new Zivs();
        zivsViens.vecums = 3;
        zivsViens.vide = "Saldūdens";
        zivsViens.dzimums = 'V';
        zivsViens.nosaukums = "Klaunzivs";
        zivsViens.printetZivi();

        Zivs[] zivis = {new Zivs(), new Zivs(), new Zivs(), new Zivs()};
        zivis[3].nosaukums = "Līdaka";
        zivis[2].nosaukums = "Asaris";
        zivis[1].nosaukums = "Rauda";
        zivis[0].nosaukums = "Sams";

        for (int i = 0; i < zivis.length; i++) {
            zivis[i].printetZivi();
        }

        Darbinieks pirmaisdarbinieks = new Darbinieks();
        pirmaisdarbinieks.vards = "Jānis";
        pirmaisdarbinieks.uzvards = "Strautiņš";
        pirmaisdarbinieks.talrunis = 11122222;
        pirmaisdarbinieks.nodala = "grāmatvedības";
        pirmaisdarbinieks.amats = "uzskaitvedis";
        pirmaisdarbinieks.vecums = 34;
        pirmaisdarbinieks.stavs = 3;

        pirmaisdarbinieks.darbiniekaID();
        pirmaisdarbinieks.darbinieksAtrodas();

        Kompanija kompanija1 = new Kompanija();
        kompanija1.nosaukums = "GOOOGL";
        kompanija1.darbiniekuSkaits = 4;
        kompanija1.gadaIenakumi = 23000;
        kompanija1.komersantaTips = "IK";
        kompanija1.vaiMaksatSpejigs = false;
        Kompanija kompanija2 = new Kompanija();
        kompanija2.nosaukums = "Ramy";
        kompanija2.darbiniekuSkaits = 23;
        kompanija2.gadaIenakumi = 1000000000;
        kompanija2.komersantaTips = "SIA";
        kompanija2.vaiMaksatSpejigs = true;

        Darbinieks darbinieks1 = new Darbinieks();
        darbinieks1.vards = "Juris";
        Darbinieks darbinieks2 = new Darbinieks();
        darbinieks1.vards = "Pēteris";
        Darbinieks[] darbinieki = {darbinieks1, darbinieks2};
        kompanija2.darbiniekuSaraksts = darbinieki; //pieskiram masivam darbiniekuSaraksts masiva darbinieki vertibas

        kompanija1.kompInfo();


        Kakis kakisViens = new Kakis("V",10,"īsa",true,false,false);
        kakisViens.printetKakis();
        System.out.println("Vedam kaki pie vetarsta");
        kakisViens.irSterilizets = true;
        kakisViens.printetKakis();

        Rinkis rinkis1 = new Rinkis(5.34);//Varam izskaukt konstrukciju ar vertibu un bez? jo ir divas definetas?
        Rinkis rinkis2 = new Rinkis();


        rinkis2.radiuss = 15.30;


        System.out.println(rinkis1.rinkaLaukums());
        System.out.println(rinkis2.rinkaLaukums());

        System.out.println(rinkis1.rinkaDiametrs());
        System.out.println(rinkis2.rinkaDiametrs());

        System.out.println(rinkis1.rinkaLinijasGarums());
        System.out.println(rinkis2.rinkaLinijasGarums());






    }
}
