package JavaProgrammingFundamentals;

import java.util.Scanner;

public class PrintNumbersInReverseOrderJoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] inputArr = new String[n];

        for (int i = 0; i < n; i++) {
            inputArr [i] = scanner.nextLine();
        }

        System.out.println(String.join(" ", inputArr));


    }
}

