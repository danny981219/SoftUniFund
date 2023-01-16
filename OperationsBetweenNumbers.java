package MoreConditionalStatements3;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        String even = "";

        switch (operator) {
            case "+":
                int plus = N1 + N2;
                if (plus % 2 == 0) {
                    even = "even";
                } else {
                    even = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, plus, even);
                break;

            case "-":
                int minus = N1 - N2;
                if (minus % 2 == 0) {
                    even = "even";
                } else {
                    even = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, minus, even);
                break;

            case "*":
                int umnojenie = N1 * N2;
                if (umnojenie % 2 == 0) {
                    even = "even";
                } else {
                    even = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, umnojenie, even);
                break;

            case "/":
                double delenie = (N1 * 1.0) / N2;
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    System.out.printf("%d %s %d = %.2f", N1, operator, N2, delenie);
                }
                break;

            case "%":

                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    int delenieModul = N1 % N2;
                    System.out.printf("%d %s %d = %d", N1, operator, N2, delenieModul);
                }
                break;

        }


    }
}
