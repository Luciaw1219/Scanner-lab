package calculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Product  Quantity  Price  Miles  Total");
        System.out.println("----         ---      -----      ----- ");

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter miles: ");
        double miles = scanner.nextDouble();

        double totalCost = quantity * price + miles;

        System.out.printf("%-13s%-8d%-10.2f%-10.2f%-10.2f\n",
                productName, quantity, price, miles, totalCost);

        System.out.println("Thank you. Come Again!");

    }

}
