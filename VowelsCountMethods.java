package JavaProgrammingFundamentals;

import java.util.Scanner;

public class VowelsCountMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        countVowels(inputLine);
    }


    public static void countVowels(String text) {

        int counter = 0;
        for (char symbol : text.toLowerCase().toCharArray()) {
            if (symbol == 'a' || symbol == 'o' || symbol == 'e' || symbol == 'u' || symbol == 'i') {
                counter++;
            }

        }
        System.out.println(counter);


    }
}