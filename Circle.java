import java.util.Scanner;

public class Circle {
    private double radius=1.0;
    private String color="red";
    Circle(){
        System.out.println("No arguments");
    }
    Circle(double d){
        this .radius=d;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Without any argument");
        Circle c1 = new Circle();
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println("With argument, enter Radius ");
        double n= sc.nextDouble();
        Circle c2 = new Circle(n);
        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());
        sc.close();


    }

}
