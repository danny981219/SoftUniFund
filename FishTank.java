package ProgrammingBasicsExercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());


        double V = length * width * height;
        double VLiters = V / 1000.0;

        double neededLiters = VLiters * (1 - (percent * 0.01));


        System.out.println(neededLiters);


    }
}
