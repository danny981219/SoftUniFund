package Lesson1ProgrammingBasics.ProgrammingBasicsBonus;

import java.util.Scanner;

public class WeatherForecastTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());

        if (26.00 <= x && x <= 35.00) {
            System.out.println("Hot");
        }
        else if (20.1 <= x && x <= 25.9) {
            System.out.println("Warm");
        }
        else if (15.00 <= x && x <= 20.00) {
            System.out.println("Mild");
        }
        else if (12.00 <= x && x <= 14.9) {
            System.out.println("Cool");
        }
        else if (5.00 <= x && x <= 11.9) {
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }
    }
}
