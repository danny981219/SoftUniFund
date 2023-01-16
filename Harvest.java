package Lesson2ConditionalStatements.ConditionalStatementsBonus;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = Integer.parseInt(scanner.nextLine());
        double Y = Double.parseDouble(scanner.nextLine());
        int Z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double GrozdeKG = X * Y;
        double Vino = ((0.40 * GrozdeKG) / 2.5);


        if (Vino < Z) {
            System.out.printf("It will be a tough winter! More %d liters wine needed.", (int) Math.floor(Z - Vino));
        } else if (Vino >= Z) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(Vino));
            System.out.printf("%d liters left -> %d liters per person.", (int) Math.ceil(Vino - Z), (int) Math.ceil((Vino - Z) / workers));
        }


    }
}
