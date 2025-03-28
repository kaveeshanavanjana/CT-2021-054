package Q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the owners Name:");
        String ownerName = scanner.nextLine();
        System.out.println("Enter the owners Phone Number:");
        String ownerPhoneNumber = scanner.nextLine();
        Bicycle bicycle = new Bicycle(ownerName, ownerPhoneNumber);

        System.out.println("Owner Name: " + bicycle.getOwnerName());
        System.out.println("Owner Phone Number: " + bicycle.getOwnerPhoneNumber());





    }
}
