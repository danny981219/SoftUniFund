package MoreConditionalStatements2;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double apartment = 0.0;
        double studio = 0.0;

        switch (month) {
            case "May":
            case "October":
                apartment = nights * 65;
                studio = nights * 50;
                if (nights > 14) {
                    studio = studio * 0.7;
                    apartment = apartment * 0.9;
                } else if (nights > 7) {
                    studio = studio * 0.95;
                }
                break;

            case "June":
            case "September":

                apartment = nights * 68.70;
                studio = 75.20 * nights;
                if (nights > 14) {
                    studio = studio * 0.80;
                    apartment = apartment * 0.90;
                }
                break;
            case "July":
            case "August":
                apartment = nights * 77;
                studio = nights* 76;
                if (nights > 14) {
                    apartment = apartment * 0.9;
                }
                break;
        }

        System.out.printf("Apartment: %.2f lv.%n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);


    }
}
