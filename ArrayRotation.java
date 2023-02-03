package JavaProgrammingFundamentals;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] array = input.split(" ");

        int rotationNumber = Integer.parseInt(scanner.nextLine());


        for (int rotation = 1; rotation <= rotationNumber; rotation++) {
            String firstElement = array[0];

            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index + 1];
            }

            array[array.length - 1] = firstElement;
        }

        for (String element : array) {
            System.out.printf("%s ", element);
        }
    }

}

