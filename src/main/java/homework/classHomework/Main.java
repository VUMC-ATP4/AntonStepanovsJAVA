package homework.classHomework;


public class Main {
    public static void main(String[] args) {


        Triangle triangle1 = new Triangle();
        triangle1.a = 3;
        triangle1.b = 3;
        triangle1.c = 3;
        System.out.println("Triangle area = " + triangle1.Area());
        //System.out.println(triangle1.a + " " + triangle1.b + " " + triangle1.c);
        System.out.println("If triangle is Equilateral: " + triangle1.TriangleEquilateral());
        System.out.println("If triangle is Equilateral: " + triangle1.TriangleIsosceles());


        System.out.println("\n");
        Triangle triangle2 = new Triangle(3, 4, 5);
        //System.out.println(triangle2.area);
    }
}
