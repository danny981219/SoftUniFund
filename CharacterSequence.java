package ForLoop;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int lengthText = text.length();
        for (int i = 0; i < lengthText; i ++){
            char symbol = text.charAt(i);
            System.out.println(symbol);
        }


    }
}
