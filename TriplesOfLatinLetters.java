package JavaProgrammingFundamentals;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 97; i < n + 97; i++) {
            for (int j = 97; j < n + 97; j++) {
                for (int k = 97; k < n + 97; k++) {
                    System.out.printf("%c%c%c%n", (char) i, (char) j, (char) k);
                }
            }
        }


    }
}
