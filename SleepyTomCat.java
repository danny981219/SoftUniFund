package Lesson2ConditionalStatements.ConditionalStatementsBonus;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int holidayDays = Integer.parseInt(scanner.nextLine());

        int norm = 30000;
        int playTimeHolidayDays = holidayDays * 127;
        int playTimeWorkDays = (365 - holidayDays) * 63;
        int allMinutes = playTimeHolidayDays + playTimeWorkDays;
        int hoursFinalinMinutes = allMinutes % 60;
        int hoorsFinalinMinutesFinal = (allMinutes - norm) % 60;
        if (allMinutes > norm) {
            System.out.printf("Tom will run away");
            System.out.println();
            System.out.printf("%d hours and %d minutes more for play", (allMinutes - norm) / 60, hoursFinalinMinutes);
        }
        if (allMinutes < norm) {

            System.out.printf("Tom sleeps well");
            System.out.println();
            System.out.printf("%d hours and %d minutes less for play", ((norm - allMinutes) / 60), -hoorsFinalinMinutesFinal);
        }


    }
}
