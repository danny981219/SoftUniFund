package JavaProgrammingFundamentals;

import java.util.Scanner;

public class commonElements2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        String[] firstArray = firstInput.split(" ");
        String[] secondArray = secondInput.split(" ");


        for (String s2 : secondArray) {
            for (String s1 : firstArray) {
                if (s1.equals(s2)) {
                    System.out.printf("%s ", s2);
                    break;
                }
            }
        }

    }
}
