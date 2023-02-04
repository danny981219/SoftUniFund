package JavaProgrammingFundamentals;

import java.util.Scanner;

public class OrdersMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        printTotalSum(product, quantity);
    }

    public static double getProductPrice(String product) {
        double amount = 0.0;
        switch (product) {
            case "coffee":
                amount = 1.5;
                break;
            case "water":
                amount = 1;
                break;
            case "coke":
                amount = 1.4;
                break;
            case "snacks":
                amount = 2;
                break;

        }
        return amount;

    }

    public static double getTotalSum(String product, int quantity) {
        double amount = getProductPrice(product);
        return amount * quantity;
    }

    public static void printTotalSum (String product, int quantity){
        double sum = getTotalSum(product,quantity);
        System.out.printf("%.2f", sum);
    }


}
