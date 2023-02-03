package JavaProgrammingFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int targetSum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < numbers.length - 1; index++) {
            int currentNum = numbers[index];
            for (int i = index + 1; i <= numbers.length - 1; i++) {
                int nextNumber = numbers[i];

                if (currentNum + nextNumber == targetSum) {
                    System.out.println(currentNum + " " + nextNumber);
                }
            }

        }


    }
}
