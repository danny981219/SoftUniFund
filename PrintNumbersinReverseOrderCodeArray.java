package JavaProgrammingFundamentals;

import java.util.Scanner;

public class PrintNumbersinReverseOrderCodeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arrays = new int[n];

        for (int i = 0; i < n; i++) {
            arrays[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = arrays.length - 1; i >= 0; i--) {
            System.out.print(arrays[i] + " ");
        }

    }
}
