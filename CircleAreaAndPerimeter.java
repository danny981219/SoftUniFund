package Lesson1ProgrammingBasics.ProgrammingBasicsBonus;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());
        double d = 2 * r;

        double perimeter = d * Math.PI;
        double area  = Math.PI * (r * r);

        System.out.printf("%.2f", area);
        System.out.println();
        System.out.printf("%.2f", perimeter);
    }
}
