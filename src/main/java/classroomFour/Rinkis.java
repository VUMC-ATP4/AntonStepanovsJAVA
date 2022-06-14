package classroomFour;

public class Rinkis {
    final double PI = 3.14;
    double radiuss = 4;

    Rinkis(){
        System.out.println("Veidoju rinķi....");
    }

    Rinkis(double radiuss) {
        System.out.println("Veidoju rinķi ar rādiusu " + radiuss);
        this.radiuss = radiuss;
    }

    public double rinkaLaukums() {
        return PI * (radiuss * radiuss);

    }
    public double rinkaDiametrs() {
        return (radiuss * 2);

    }
    public double rinkaLinijasGarums() {
        return 2 * PI * radiuss;

    }
}
