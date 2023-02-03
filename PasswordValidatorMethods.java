package JavaProgrammingFundamentals;

import java.util.Scanner;

public class PasswordValidatorMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isValidLength = isValidLength(password);
        if (!isValidLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isValidContents = isValidContents(password);
        if (!isValidContents(password)) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isValidOverTwoDigits = isValidOverTwoDigits(password);
        if (!isValidOverTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }

       // all
        if (isValidContents && isValidLength && isValidOverTwoDigits) {
            System.out.println("Password is valid");
        }
    }


    public static boolean isValidLength(String password) {
        return password.length() >= 6 && password.length() <= 10;

    }

    public static boolean isValidContents(String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidOverTwoDigits(String password) {
        int countDigits = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                countDigits++;
            }
        }
        return countDigits >= 2;
    }


}