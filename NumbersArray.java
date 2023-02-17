package JavaProgrammingFundamentals;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class NumbersArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        double averageNumber = 0.0;
        int sumArray = 0;
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            sumArray += numbers[i];
        }
        averageNumber = sumArray * 1.0 / numbers.length;

        for (int i = numbers.length - 1; i >= 0; i--) {

            sort(numbers);
            if (averageNumber < numbers[i]) {
                counter++;
                if (counter <= 5) {
                    System.out.print(numbers[i] + " ");
                }
            }
        }

        if (counter == 0) {
            System.out.println("No");
        }
        
    }
}