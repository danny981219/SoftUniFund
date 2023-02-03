package JavaProgrammingFundamentals;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startCode = Integer.parseInt(scanner.nextLine());
        int endCode = Integer.parseInt(scanner.nextLine());

        for (int i = startCode; i <= endCode ; i++) {
            System.out.print((char) i + " ");

        }



    }
}
