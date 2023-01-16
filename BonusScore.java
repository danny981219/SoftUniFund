package Lesson2ConditionalStatements.Lesson2ConditionalStatementsExercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer a = Integer.parseInt(scanner.nextLine());
        double bonus = 0.0;

        if (a <= 100) {
            bonus = 5;
        } else if (a > 1000) {
            bonus = (0.1 * a);
        } else {
            bonus = (0.2 * a);
        }

        if (a % 2 == 0) {
            bonus = bonus + 1;
        } else if (a % 10 == 5) {
            bonus = bonus + 2;
        }

        System.out.println(bonus);
        System.out.println(bonus + a);
    }
}
