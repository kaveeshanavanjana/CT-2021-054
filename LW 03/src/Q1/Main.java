package Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius:");
        double input = scanner.nextDouble();

        Temperature temp = new Temperature(input);
        System.out.println("Equivalent temperature in Fahrenheit :"+temp.toFahrenheit());


    }
}
