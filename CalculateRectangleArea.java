package JavaProgrammingFundamentals;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        areaRectangle(n,m);
    }

    public static void areaRectangle(int number1, int number2) {
        int sum = 0;

        sum = number1 * number2;

        System.out.println(sum);

    }


}
