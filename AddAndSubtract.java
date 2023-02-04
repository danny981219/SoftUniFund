package JavaProgrammingFundamentals;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        sum(num1, num2, num3);
        subtract(num1, num2, num3);


    }

    public static void sum(int number1, int number2, int number3) {
        int sum = 0;
        sum = number1 + number2;
    }

    public static void subtract(int number1, int number2, int number3) {
        int subtract = 0;
        subtract = number1 + number2 - number3;
        System.out.println(subtract);
    }
}
