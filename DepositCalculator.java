package ProgrammingBasicsExercise;

import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

       double sum = depositSum + month *((depositSum *(percent / 100)) /12);

        System.out.println(sum);

    }
}
