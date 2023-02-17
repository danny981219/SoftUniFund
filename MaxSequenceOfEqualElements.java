package JavaProgrammingFundamentals;

import java.util.Arrays;
import java.util.Scanner;


public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integerArr = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int length = 1;
        int maxLength = 1;
        int start = 0;
        int maxStart = 0;

        for (int i = 1; i < integerArr.length; i++) {
            if (integerArr[i] == integerArr[i - 1]) {
                length++;
            } else {
                if (length > maxLength) {
                    maxLength = length;
                    maxStart = start;
                }
                start = i;
                length = 1;
            }
        }

        if (length > maxLength){
            maxLength = length;
            maxStart = start;
    }

        for (int i = maxStart; i < maxStart+ maxLength; i++) {
            System.out.print(integerArr[i] + " ");
        }
}
}

