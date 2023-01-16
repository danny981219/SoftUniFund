package Lesson2ConditionalStatements.Lesson2ConditionalStatementsExercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameofMovie = scanner.nextLine();
        int movieLength = Integer.parseInt(scanner.nextLine());
        int pauseLength = Integer.parseInt(scanner.nextLine());

        double timeForLunch = 0.125 * pauseLength;
        double relax = 0.25 * pauseLength;
        double leftTime = pauseLength - timeForLunch - relax;

        if (leftTime >= movieLength) {
            System.out.printf("You have enough time to watch " + nameofMovie + " and left with " + (int) Math.ceil(leftTime-movieLength) +" minutes free time.");
        } else {
            System.out.printf("You don't have enough time to watch " + nameofMovie + ", you need " + (int) Math.ceil(movieLength-leftTime) + " more minutes.");
        }


    }
}
