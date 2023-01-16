package MoreConditionalStatements3;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double priceFlower = 0.0;


        switch (flower) {
            case "Roses":
                if (numberFlowers > 80) {
                    priceFlower = 5.00 * numberFlowers * 0.90;
                } else {
                    priceFlower = 5.00 * numberFlowers;
                }
                break;

            case "Dahlias":
                if (numberFlowers > 90) {
                    priceFlower = 3.80 * numberFlowers * 0.85;
                } else {
                    priceFlower = 3.80 * numberFlowers;
                }
                break;

            case "Tulips":
                if (numberFlowers > 80) {
                    priceFlower = 2.80 * numberFlowers * 0.85;
                } else {
                    priceFlower = 2.80 * numberFlowers;
                }
                break;

            case "Narcissus":
                if (numberFlowers < 120) {
                    priceFlower = 3.0 * numberFlowers * 1.15;
                } else {
                    priceFlower = 3.0 * numberFlowers;
                }
                break;

            case "Gladiolus":
                if (numberFlowers < 80) {
                    priceFlower = 2.50 * numberFlowers * 1.20;
                } else {
                    priceFlower = 2.50 * numberFlowers;
                }
                break;
        }

        if (priceFlower>budget){
            System.out.printf("Not enough money, you need %.2f leva more.", priceFlower - budget);
        } else
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlowers, flower, budget-priceFlower);


    }
}
