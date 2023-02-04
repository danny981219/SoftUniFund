package JavaProgrammingFundamentals;

import java.util.Scanner;

public class RepeatStringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String asd = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(n, asd));


    }


    public static String repeatString(int count, String str) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + str;
        }
        return result;
    }


}
