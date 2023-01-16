package Lesson2ConditionalStatements.ConditionalStatements;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        if (a.equals("square")) {
            double b = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", b * b);
        }
        if (a.equals("rectangle")) {
            double c = Double.parseDouble(scanner.nextLine());
            double d = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", c * d);
        }
        if (a.equals("circle")) {
            double g = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", Math.PI * (g * g));
        }
        if (a.equals("triangle")) {
            double e = Double.parseDouble(scanner.nextLine());
            double t = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (e * t) / 2.0);

        }


    }
}
