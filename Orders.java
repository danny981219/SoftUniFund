package JavaProgrammingFundamentals;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orderNumber = Integer.parseInt(scanner.nextLine());

        double sum = 0.0;
        double priceOfCoffee = 0.0;

        for (int i = 0; i < orderNumber; i++) {
            double capsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            for (int j = 0; j < orderNumber; j++) {
                priceOfCoffee = capsule * days * capsulesCount;
            }

            System.out.printf("The price for the coffee is: $%.2f%n", priceOfCoffee);
            sum += priceOfCoffee;
        }
        System.out.printf("Total: $%.2f", sum);


    }
}
