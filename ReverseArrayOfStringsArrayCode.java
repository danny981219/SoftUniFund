package JavaProgrammingFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStringsArrayCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        for (int index = 0; index < array.length / 2; index++) {

            String oldElement = array[index];
            array[index] = array[array.length - 1 - index];

            array[array.length - 1 - index] = oldElement;

        }

        System.out.println(String.join(" ", array));

    }
}
