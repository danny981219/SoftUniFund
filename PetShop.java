package ProgrammingBasics;

import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());
        double priceDogFood = dogFood * 2.50;
        double priceCatFood = catFood * 4;
        double sumPrice = priceDogFood + priceCatFood;

        System.out.println(sumPrice + " lv.");

    }
}
