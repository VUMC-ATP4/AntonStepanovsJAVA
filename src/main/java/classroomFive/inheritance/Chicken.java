package classroomFive.inheritance;

public class Chicken extends Animal {
    Chicken(int legCount, String name) {
        super(legCount, name);
    }

    @Override
    public void makeSound(){
        System.out.println("Es esmu vista...");
    }
}
