package Lesson1ProgrammingBasics.ProgrammingBasicsBonus;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double greenPaint = 3.4;
        double redPaint = 4.3;

        double frontWall = (x * x) - (1.2 * 2);
        double backWall = x * x;
        double sideWalls = ((x * y) * 2) - ((1.5 * 1.5) * 2);

        double roofSide = (x * y) * 2;
        double roofFrontAndBack = ((x * h) / 2) * 2;

        double wallS = frontWall + backWall + sideWalls;
        double roofS = roofSide + roofFrontAndBack;

        double wallSPaint = wallS / greenPaint;
        double roofSPaint = roofS / redPaint;

        System.out.printf("%.2f", wallSPaint);
        System.out.println();
        System.out.printf("%.2f", roofSPaint);


    }
}
//