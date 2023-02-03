package JavaProgrammingFundamentals;

import java.util.Scanner;

public class PalindromeIntegersMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while (!command.equals("END")) {
            if (isPalindrome(command)) {
                System.out.println("true");
            }else {
                System.out.println("false");
            }
            command = scanner.nextLine();
        }

    }



    public static boolean isPalindrome (String text){
        String reversedString = "";

        for (int index = text.length() - 1 ; index >=  0; index--) {
            reversedString += text.charAt(index);

        }
       return text.equals(reversedString);

    }
}
