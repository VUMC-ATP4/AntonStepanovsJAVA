package classroomTwo;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class PracticalTaskTwo {

    public static void main(String[] args) {
//tips nsaukums deklarācija
        Scanner scanner = new Scanner(System.in);
        int vecums;
        boolean canVote = false;
        System.out.println("Paskaties cilvēka pasē?");
        vecums = scanner.nextInt();
        if (vecums >= 18) {
            canVote = true;
        }

        if(canVote){
            System.out.println("Cilveks var balsot");
        } else{
            System.out.println("Cilveks nevar balsot");
        }

        int month = 3;

        switch (month){
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 12:
                System.out.println("Decembris");
            default:
                System.out.println("Mēnesis " + month + " nav definēts");
        }




        int x = 10;
        int y = 20;

        if (y > x && x > 5){
            System.out.println("y ir lielāks par x un x lielāks par 5");
        }
//
//        int skaitlis = 5;
//        if (skaitlis>0){
//            System.out.println(skaitlis + " ir pozitīvs skaitlis!");
//        }else if (skaitlis<0){
//            System.out.println(skaitlis + " ir negatīvs skaitlis!");
//        }else {
//            System.out.println(skaitlis + " ir NULLE!");
//        }



        int skaitlisB;
        System.out.println("Ievadām skaitli?");

        skaitlisB = scanner.nextInt();


        switch(skaitlisB){
            case 10:
                System.out.println("Skaitlis  = 10");
                break;
            case 15:
                System.out.println("Skaitlis = 15");
                break;
            case 20:
                System.out.println("skaitlis = 20");
                break;
            default:
                System.out.println("Skaitlis nezināms");
        }


        if (skaitlisB==10){
            System.out.println("Skaitlis ir 10!");
        }else if (skaitlisB==15){
            System.out.println("Skaitlis ir 15!");
        }else if (skaitlisB==20){
            System.out.println("Skaitlis ir 20!");
        }else {
            System.out.println("Skaitlis ir nezināms");
        }


        int q = 10;

        if(q>0){
            System.out.println("Skaitlis ir lielaks par nulli");
        }


        int cilvekaVecums=65;
        char dzimums = 'V';
        boolean drikstDoties = false;

        if(dzimums=='V' && cilvekaVecums >=65){
            drikstDoties = true;
        } else if(dzimums=='S' && cilvekaVecums>=60){
            drikstDoties=true;
        }

        System.out.println("Cilveks drikst doties pensija " + drikstDoties);

        int skaitlisX = 14;

        if (skaitlisX % 2 == 0) {
            System.out.println("Skaitlis ir pāra");
        } else {
            System.out.println("Skaitlis ir nepāra");
        }



        System.out.println("Ievadi savu vārdu");

        String vards = scanner.nextLine();

//        System.out.println("Labdien " + vards + "!");
//        System.out.println("Esi sveicināts kalkulatora programmā!");
//
//        int a;
//        int b;
//        int summa;
//
//        System.out.println("Ievadi skaitli a");
//        a = scanner.nextInt();
//
//        System.out.println("Ievadi skaitli b");
//        b = scanner.nextInt();
//
//        System.out.println(a > b);
//
//        System.out.println("Šeit jābūt nepatiesam: "+ (5>10));
//        System.out.println("Šeit jābūt patiesam: "+ (5<10));
//        System.out.println("Šeit jābūt nepatiesam: "+ (5==6));
//        System.out.println("Šeit jābūt patiesam: "+ (5==5));
//        System.out.println("Šeit jābūt patiesam: "+ (5!=6));
//        System.out.println("Šeit jābūt nepatiesam: "+ (5!=5));
//
//        int vecums = 18;
//        System.out.println(vecums >= 18);
//
//        int bernaVecums = 5;
//        System.out.println(bernaVecums <= 5);
//
//        System.out.println(vecums>bernaVecums);
//        boolean isEligibleToVote = vecums >= 18;
//        System.out.println("Vai cilvēks drīkst balsot ? " + isEligibleToVote);
//
//        String name = "Juris";
//        String nameTwo = "Juris";
//        System.out.println(name.equals(nameTwo));
//        System.out.println(name.equals(true=true));
//
//        System.out.println(5>3);
//
//        System.out.println("Ievadi X");
//        int x = 4;
//        boolean vaiIrPatiess = ((x < 5) && (x < 10)); //true
//        int x = 5;
//        System.out.println((x <5 && x < 10)); //false
//        System.out.println((x <5 || x < 10)); //true




//        summa = a + b;
//        System.out.println(String.format("%s,%s + %s = %s",vards,a,b,summa));



//        System.out.println("Šī ir otrā Java lekcija");
//        String teksts;
//        //String name = "Juris";
//        //teksts = String.format("Mani sauc %s", name);
//
//        //System.out.println(teksts);
//
        double a = 100.25;
        double b = 102;
        System.out.println("a/b = " + (b / a));
        System.out.println(String.format("%.2f",(b / a)));
//
//        String name = "Juris";
//        String surname = "Kreilis";
//        String role = "Pasniedzējs";
//        double videjaAtzime = 7.3214;
//
//        String concatTeikums = "Mani sauc " + name + " Mans uzvārds ir " + surname + " Es esmu " + role;
//        String teikums = String.format("Mani sauc %s. Mans uzvārds ir %s. Es esmu %s. Mana vid atz ir %.1f",name,surname,role,videjaAtzime);
//
//        System.out.println(teikums);
//        System.out.println(concatTeikums);


//        int a = 10;
//        int b = 20;
//        int c = 20;
//        int d = 0;
//        System.out.println((a < b) && (b == c)); //true
//        System.out.println((a > b) && (c == d)); //false
//
//        System.out.println(!(a>b)); //true




    }
}
