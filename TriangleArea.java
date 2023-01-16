package Lesson1ProgrammingBasics.ProgrammingBasicsBonus;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // страна и височина на триъгълник и пресмята неговото лице.
        // area = a*h/2
        //format until 50.00

        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double s = a * h / 2;

        System.out.printf("%.2f", s);


    }
}
