package Lesson1ProgrammingBasics.ProgrammingBasicsBonus;

import java.util.Scanner;

public class TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lice na trapec s osnovi b1 i b2 i visochina h
        //Формулата за лице на трапец е (b1 + b2) * h / 2.

        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double s = ((b1 + b2) * h) / 2;

        System.out.printf("%.2f", s);


    }
}
