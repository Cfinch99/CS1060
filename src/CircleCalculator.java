import java.util.Scanner;

public class CircleCalculator {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is the radius?");
        double radius = in.nextDouble();

        double diameter = diameterFunc(radius);
        System.out.println("Diameter is " + diameter);

        double area = areaFunc(radius);
        System.out.println("Area is " + area);

        double circumference = circFunc(radius);
        System.out.println("Circumference is " + circumference);
    }

    public static double diameterFunc(double radius) {
        return radius * 2;
    }
    public static double areaFunc(double radius) {
        return Math.PI * (radius * radius);
    }
    public static double circFunc(double radius) {
        return 2 * Math.PI * radius;
    }


}
