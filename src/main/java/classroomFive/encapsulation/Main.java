package classroomFive.encapsulation;

public class Main {
    public static void main(String[] args) {
        Bird putns = new Bird();
        putns.setKrasa("Zila"); // var izmantot, izmainit, pieklut arpus klases, jo public

        System.out.println(putns.getKrasa());
        //System.out.println(putns.name); //nevar izmantot, nevar pieklut, nevar izmainit arpus klases, jo private

        putns.printText();
        //putns.defaultMethodExample(); Nevar izsaukt jo privāta metode
        putns.defaultMethodExample();

        Human cilveks = new Human();
        cilveks.setAge(20);
        cilveks.setName("Antons");
        cilveks.setSurname("Stepanovs");
        cilveks.setHeight(170.2);
        System.out.println(cilveks.getAge());
        System.out.println(cilveks.getName());
        System.out.println(cilveks.getSurname());
        System.out.println(cilveks.getHeight());

        //Method overload
        Matematika matematika = new Matematika();
        System.out.println(matematika.add(30,20));
        System.out.println(matematika.add(1.3, 3.5));

        matematika.paraditTekstu("Juris");
        matematika.paraditTekstu("Juris",true);
        matematika.paraditTekstu("Anna",false);



    }

}
