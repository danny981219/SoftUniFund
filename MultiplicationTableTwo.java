package JavaProgrammingFundamentals;

import java.util.Scanner;

public class MultiplicationTableTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());

        int sum = a * b;

        for (int i = b; i <= 10;  i++) {
            sum = a * i;
            System.out.printf("%d X %d = %d%n", a, i, sum);
        }


        if (a > 10 || b > 10) {
            System.out.printf("%d X %d = %d%n", a, b, sum);
        }

    }

}



