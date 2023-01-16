package Lesson2ConditionalStatements.Lesson2ConditionalStatementsExercise;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hour * 60 + min + 15;
        hour = totalMinutes / 60;
        min = totalMinutes % 60;
        if (hour > 23) {

            hour = 0;
        }
        if (min < 10) {
            System.out.printf("%d:%02d", hour, min);
        } else {
            System.out.printf("%d:%2d", hour, min);
        }

    }
}
