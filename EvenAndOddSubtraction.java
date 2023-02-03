package JavaProgrammingFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;
        int[] numbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int item : numbersArray) {
            if (item % 2 == 0) {
                evenSum += item;
            } else {
                oddSum += item;
            }

        }

        System.out.println(evenSum - oddSum);

    }
}
