package JavaProgrammingFundamentals;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int fourth = Integer.parseInt(scanner.nextLine());

        int sum1plus2 = first + second;
        int sum1plus2divideThird = sum1plus2 / third;
        int multiply = sum1plus2divideThird * fourth;

        System.out.println(multiply);



    }
}
