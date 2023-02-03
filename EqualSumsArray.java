package JavaProgrammingFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSumsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int index = 0; index < numbers.length; index++) {
            int currentElement = numbers[index];

            int leftSum = 0;
            int rightSum = 0;


            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbers[leftIndex];
            }

            for (int rightIndex = index + 1; rightIndex < numbers.length; rightIndex++) {
                rightSum += numbers[rightIndex];
            }

            if (leftSum == rightSum) {
                System.out.println(index);
                return;
            }
        }

        System.out.println("no");

    }
}
