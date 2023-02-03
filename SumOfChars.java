package JavaProgrammingFundamentals;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine()); // broi na simvoli ot konzolata

        int sum = 0;
        for (int count = 1; count <=number ; count++) {
            char symbol = scanner.nextLine().charAt(0);
            int asciiCode = (int) symbol;
            sum = sum + asciiCode;
        }
        System.out.printf("The sum equals: %d",sum);


    }
}
