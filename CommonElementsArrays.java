package JavaProgrammingFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElementsArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstRow = scanner.nextLine();
        String secondRow = scanner.nextLine();

        String[] firstArray = firstRow.split(" ");
        String[] secondArray = secondRow.split(" ");

        for (String secondElement : secondArray) {
            for (String firstElement : firstArray) {
                if (firstElement.equals(secondElement)) {
                    System.out.printf("%s ", secondElement);
                    break;
                }

            }
        }


    }
}
