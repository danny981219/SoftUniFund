package JavaProgrammingFundamentals;

import java.util.Scanner;

public class CalculationsMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());


        switch (inputLine) {
            case "add":
                add(num1, num2);
                break;
            case "divide":
                divide(num1, num2);
                break;
            case "subtract":
                subtract(num1, num2);
                break;
            case "multiply":
                multiply(num1, num2);
                break;
        }

    }


    public static void add(int firstNum, int secondNum) {
        System.out.println(firstNum + secondNum);
    }

    public static void divide(int firstNum, int secondNum) {
        System.out.println(firstNum / secondNum);
    }

    public static void subtract(int firstNum, int secondNum) {
        System.out.println(firstNum - secondNum);
    }

    public static void multiply(int firstNum, int secondNum) {
        System.out.println(firstNum * secondNum);
    }

}

