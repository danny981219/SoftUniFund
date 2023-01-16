package ProgrammingBasicsExercise;

import java.util.Scanner;

public class FoodDelivery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double chickenSum = 10.35;
        double fishSum = 12.40;
        double veganSum = 8.15;

        double delivery = 2.50;

        double Chicken = Double.parseDouble(scanner.nextLine());
        double Fish = Double.parseDouble(scanner.nextLine());
        double Vegan = Double.parseDouble(scanner.nextLine());

        double formChicken = chickenSum * Chicken;
        double formFish = fishSum * Fish;
        double formVegan = veganSum * Vegan;

        double wholeSumWithoutDelivery = formChicken + formFish + formVegan;
        double desert = wholeSumWithoutDelivery * 0.2;

        double wholeSumWithDelivery = desert + wholeSumWithoutDelivery + delivery;


        System.out.println(wholeSumWithDelivery);


    }
}
