package JavaProgrammingFundamentals;

import java.util.Scanner;

public class SignOfIntegerMethod {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numberInput = Integer.parseInt(scanner.nextLine());

        printNumSign(numberInput);

    }



        public static void printNumSign (int numberInput){
            String signWord = "";

            if (numberInput > 0) {
                signWord = "positive";
                System.out.printf("The number %d is %s.", numberInput, signWord);
            } else if (numberInput < 0) {
                signWord = "negative";
                System.out.printf("The number %d is %s.", numberInput, signWord);
            } else {
                signWord = "zero";
                System.out.printf("The number %d is %s.", numberInput, signWord);
            }


    }
}
