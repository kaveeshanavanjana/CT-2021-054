package Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:");
        double celsius = scanner.nextDouble();
        Temperature temp = new Temperature(celsius);
        temp.setFahrenheit(celsius);
        System.out.println("Temperature in Celsius: "+ temp.toCelsius());
    }
}