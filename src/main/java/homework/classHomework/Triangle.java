package homework.classHomework;

public class Triangle {
    int a;
    int b;
    int c;
    double area;

    boolean ifEquilateral;
    boolean ifIsosceles;

    public Triangle(){
        System.out.println("Creating a triangle...");
    }

    public Triangle (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
                     System.out.println("Triangle area: " + Area());
                     this.area = Area();
    }

    public double Area (){
        return (Math.sqrt(((a*a+b*b+c*c)*(a*a+b*b+c*c))-2*(a*a*a*a+b*b*b*b+c*c*c*c)))/4;
    }

    public boolean TriangleEquilateral() {
        if ((a == b) && b == c) {
            ifEquilateral = true;
        } else {
            ifEquilateral = false;
        }
        return ifEquilateral;
    }

    public boolean TriangleIsosceles() {
        if ((a == b) || b == c || c == a) {
            ifIsosceles = true;
        } else {
            ifIsosceles = false;
        }
        return ifIsosceles;
    }

}
