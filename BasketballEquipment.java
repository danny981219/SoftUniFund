package ProgrammingBasicsExercise;

import java.util.Scanner;

public class BasketballEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int priceFor1Year = Integer.parseInt(scanner.nextLine());


        double shoes = priceFor1Year - (priceFor1Year * 0.40);
        double dress = shoes - (shoes * 0.2);
        double ball = dress * 0.25;
        double accesories = ball * 0.20;

        double sum = shoes + dress + ball + accesories + priceFor1Year;

        System.out.println(sum);


    }
}
