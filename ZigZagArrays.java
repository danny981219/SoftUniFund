package JavaProgrammingFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        for (int i = 0; i < n; i++) {
            String[] arr = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                firstArray[i] = arr[0];
                secondArray[i] = arr[1];
            } else {
                secondArray[i] = arr[0];
                firstArray[i] = arr[1];
            }
        }

        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));


    }
}
