package ProgrammingBasicsExercise;

import java.util.Scanner;

public class SuppliesForSchool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pen = Double.parseDouble(scanner.nextLine());
        double marker = Double.parseDouble(scanner.nextLine());
        double chemical = Double.parseDouble(scanner.nextLine());
        double percentDiscount = Double.parseDouble(scanner.nextLine());

        double penCost = pen * 5.80;
        double markerCost = marker * 7.20;
        double chemicalCost = chemical * 1.20;
        double finalCostWithoutPercent = penCost + markerCost + chemicalCost;

        double finalSum = finalCostWithoutPercent - ((percentDiscount / 100.0) * finalCostWithoutPercent);

        System.out.println(finalSum);
    }
}
