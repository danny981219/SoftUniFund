package Lesson1ProgrammingBasics.ProgrammingBasicsBonus;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ot gradus po celzii v gradusi po farenhait
        //formula
        //format do 50.00

        double celsius = Double.parseDouble(scanner.nextLine());
        double farenheit = (celsius * 1.8) + 32;

        System.out.printf("%.2f", farenheit);


    }
}
