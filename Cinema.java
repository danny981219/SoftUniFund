package MoreConditionalStatements2;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        // pravoagalna zala s bileti na 3 razlichni ceni

        double income = 0;

        if ("Premiere".equals(projection)) {

            income = rows * cols * 12;

        }
        if ("Normal".equals(projection)) {

            income = rows * cols * 7.50;

        }
        if ("Discount".equals(projection)) {

            income = rows * cols * 5.00;

        }

        System.out.printf("%.2f leva", income);

    }
}
