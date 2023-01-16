package Lesson2ConditionalStatements.Lesson2ConditionalStatementsExercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble((scanner.nextLine()));//BUDGET 900
        int N = Integer.parseInt(scanner.nextLine()); //VIDEOKARTI
        int M = Integer.parseInt(scanner.nextLine());// PROCESOR
        int P = Integer.parseInt(scanner.nextLine());//RAM PAMET

        double sumN = 250 * N;
        double sumM = 0.35 * sumN;
        double sumP = 0.10 * sumN;

        double totalPrice = sumN + (sumM * M) + (sumP * P);

        if (N > M) {
             totalPrice *= 0.85;
        }

        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }


    }
}


