package JavaProgrammingFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubtractorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i : numbers) {
            if (i % 2 == 0){
                sumEven += i;
            }else {
                sumOdd += i;
            }
        }

        System.out.println(sumEven - sumOdd);



    }
}
