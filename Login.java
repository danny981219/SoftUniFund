package JavaProgrammingFundamentals;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }

        String enteredPassword = scanner.nextLine();
        int countFailedTries = 0;
        while (!enteredPassword.equals(password)) {
            countFailedTries += 1;
            if (countFailedTries == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }

        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }


    }
}
