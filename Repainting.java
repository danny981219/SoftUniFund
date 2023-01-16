package ProgrammingBasicsExercise;

import java.util.Scanner;

public class Repainting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());


        double nylonCost = (nylon + 2) * 1.50;
        double paintCost = ((paint * 0.1) + paint)* 14.50;
        double thinnerCost = thinner * 5.00;
        double bags = 0.40;

        double sumFinal = nylonCost + paintCost + thinnerCost + bags;

        double sumWorker = hour * (0.3 * sumFinal);
        double sumTotal = sumWorker + sumFinal;


        System.out.println(sumTotal);


    }
}
