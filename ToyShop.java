package Lesson2ConditionalStatements.Lesson2ConditionalStatementsExercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double puzzle = 2.60;
        double speakingDoll = 3.0;
        double bear = 4.10;
        double minion = 8.20;
        double truck = 2.0;

        double costOfExcursion = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int speakingDollCount = Integer.parseInt(scanner.nextLine());
        int bearCount = Integer.parseInt(scanner.nextLine());
        int minionCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());

        double sum = (puzzleCount * puzzle) + (speakingDollCount * speakingDoll) + (bearCount * bear) + (minionCount * minion) + (truckCount * truck);
        double sumOfToys = puzzleCount + speakingDollCount + bearCount + minionCount + truckCount;

        if (sumOfToys >= 50) {
            sum = sum - (sum * 0.25);
        }
        sum = sum - (sum * 0.1);

        if (costOfExcursion <= sum) {
            System.out.printf("Yes! %.2f lv left.", sum - costOfExcursion);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", costOfExcursion - sum);
        }


    }
}
