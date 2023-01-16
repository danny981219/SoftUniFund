package Lesson2ConditionalStatements.ConditionalStatementsBonus;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volumePool = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double N = Double.parseDouble(scanner.nextLine());

        double LiterHourToP1 = N * P1;
        double LiterHourToP2 = N * P2;
        double literToAllPipesForN = LiterHourToP1 + LiterHourToP2;

        double litersToAllPipesForNPercent = (literToAllPipesForN * 100) / volumePool;

        double percentP1 = (LiterHourToP1 * 100) / literToAllPipesForN;
        double percentP2 = (LiterHourToP2 * 100) / literToAllPipesForN;
        double litersFull = literToAllPipesForN - volumePool;

        //System.out.printf("%.2f%%", percentP1);
        if (literToAllPipesForN <= volumePool) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%", litersToAllPipesForNPercent, percentP1, percentP2);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", N, literToAllPipesForN - volumePool);

        }
    }
}
