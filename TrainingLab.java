package Lesson1ProgrammingBasics.ProgrammingBasicsBonus;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        int cols = (int) ((h - 1) / 0.70);
        int rows = (int) (w / 1.20);
        int seats = (cols * rows) - 3;

        System.out.println(seats);
    }
}
