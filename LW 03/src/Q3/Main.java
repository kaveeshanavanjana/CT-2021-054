package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the inner circle:");
        double innerCircleRadius = scanner.nextDouble();
        Circle innerCircle = new Circle(innerCircleRadius);

        double innerCircleArea = innerCircle.computeArea();
        double innerCircleCircumference = innerCircle.computeCircumference();


        System.out.println("Enter the radius of the outer circle:");
        double outerCircleRadius = scanner.nextDouble();
        Circle outerCircle = new Circle(outerCircleRadius);
        double outerCircleArea = outerCircle.computeArea();
        double outerCircleCircumference = outerCircle.computeCircumference();

        double AreaDifference = outerCircleArea - innerCircleArea;
        double CircumferenceDifference = outerCircleCircumference - innerCircleCircumference;
        System.out.println("Area : " + AreaDifference);
        System.out.println("Circumference : " + CircumferenceDifference);

    }
}
