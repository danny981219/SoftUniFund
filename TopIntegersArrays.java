package JavaProgrammingFundamentals;

import java.util.Scanner;

public class TopIntegersArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = Integer.parseInt(array[i]);
        }

        for (int i = 0; i < newArray.length - 1; i++) {
            int currentNum = newArray[i];
            boolean topInteger = true;
            for (int j = i + 1; j < newArray.length; j++) {
                int secondNum = newArray[j];
                if (currentNum <= secondNum) {
                    topInteger = false;
                    break;
                }
            }

            if (topInteger) {
                System.out.print(currentNum + " ");
            }
        }

        System.out.println(newArray[newArray.length - 1]);
    }
}