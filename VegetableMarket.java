package Lesson1ProgrammingBasics.ProgrammingBasicsBonus;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //4 chisla ot konzola
        // prihodite v evro ako priemem che 1 evro e 1.94 lv.

        double cost1KGvegetables = Double.parseDouble(scanner.nextLine());
        double cost1KGFruits = Double.parseDouble(scanner.nextLine());
        int sumKGVegetables = Integer.parseInt(scanner.nextLine());
        int sumKGFruits = Integer.parseInt(scanner.nextLine());

        double sumCostLeva = (cost1KGvegetables * sumKGVegetables) + (cost1KGFruits * sumKGFruits);
        double sumCostEuro = sumCostLeva / 1.94;


        System.out.printf("%.2f", sumCostEuro);


    }
}
