package Lesson2ConditionalStatements.Lesson2ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSec = Double.parseDouble(scanner.nextLine());

        double result = distance * timeInSec; // obshtiq rezultat na Ivan
        double slowDown = Math.floor(distance / 15) * 12.5; // na vseki 15m toi gubi 12.5 sek

        double finalResult = result + slowDown;

        if (finalResult < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", (finalResult));
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(record - finalResult));
        }
    }
}
