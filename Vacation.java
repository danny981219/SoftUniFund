package JavaProgrammingFundamentals;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.nextLine();
        String typeOfDay = scanner.nextLine();

        int casses = 0;

        double price = 0.0;
        double totalPrice = 0.0;
        switch (typeOfPeople) {
            case "Students":
                if (typeOfDay.equals("Friday")) {
                    price = 8.45;
                }
                if (typeOfDay.equals("Saturday")) {
                    price = 9.80;
                }
                if (typeOfDay.equals("Sunday")) {
                    price = 10.46;
                }
                casses = 1;
                break;
            case "Business":
                if (typeOfDay.equals("Friday")) {
                    price = 10.90;
                }
                if (typeOfDay.equals("Saturday")) {
                    price = 15.60;
                }
                if (typeOfDay.equals("Sunday")) {
                    price = 16;
                }
                casses = 2;
                break;
            case "Regular":
                if (typeOfDay.equals("Friday")) {
                    price = 15.0;
                }
                if (typeOfDay.equals("Saturday")) {
                    price = 20.0;
                }
                if (typeOfDay.equals("Sunday")) {
                    price = 22.50;
                }
                casses = 3;
                break;
        }
        ;
        if (people >= 30 && casses == 1) {
            totalPrice = (price * people) * 0.85;
            System.out.printf("Total price: %.2f", totalPrice);
        } else if( casses == 1){
            System.out.printf("Total price: %.2f", price * people);
        }
        if (people >= 100 && casses == 2) {
            totalPrice = (price * (people - 10));
            System.out.printf("Total price: %.2f", totalPrice);
        }else if (casses == 2){
            System.out.printf("Total price: %.2f", price*people);
        }
        if (people >= 10 && casses == 3 && people <= 20) {
            totalPrice = (price * people) * 0.95;
            System.out.printf("Total price: %.2f", totalPrice);
        } else if (casses == 3){
            System.out.printf("Total price: %.2f", price * people);
        }


    }
}