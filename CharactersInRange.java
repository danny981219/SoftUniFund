package JavaProgrammingFundamentals;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char char1 = scanner.next().charAt(0);
        char char2 = scanner.next().charAt(0);

        printCharactersBetween(char1, char2);

    }

    public static void printCharactersBetween(char char1, char char2) {
        if (char1 > char2) {
            char temp = char1;
            char1 = char2;
            char2 = temp;
        }

        for (int i = char1 + 1; i < char2; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }
}
