package JavaProgrammingFundamentals;

import java.util.Scanner;

public class MiddleCharactersMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleChars(input);

    }


    public static void printMiddleChars(String text) {

        if (text.length() % 2 != 0) {
            int indexOfMiddleChar = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddleChar));
        } else {
            int indexOfFirstMiddleChars = text.length() / 2 - 1;
            int indexOfSecondsMiddleChars = text.length() / 2;

            System.out.print(text.charAt(indexOfFirstMiddleChars));
            System.out.print(text.charAt(indexOfSecondsMiddleChars));
        }

    }


}
