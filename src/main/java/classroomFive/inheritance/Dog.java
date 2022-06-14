package classroomFive.inheritance;

public class Dog extends Animal {
    Dog(int legCount, String name) {
        super(legCount, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Es esmu suns. Vau vau Vau...");
    }
}
