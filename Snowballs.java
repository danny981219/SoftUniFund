package JavaProgrammingFundamentals;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double bestSnowBall = 0;
        int bestSnowBallSnow = 0;
        int bestSnowballTime = 0;
        int bestQuality = 0;

        for (int i = 0; i < number; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());


                double formula = Math.pow((int)(snowballSnow / snowballTime), snowballQuality);

                if (formula >= bestSnowBall){
                    bestSnowBall = formula;
                    bestSnowBallSnow = snowballSnow;
                    bestSnowballTime = snowballTime;
                    bestQuality = snowballQuality;
                }


        }
        System.out.printf("%d : %d = %.0f (%d)", bestSnowBallSnow, bestSnowballTime, bestSnowBall, bestQuality);



    }
}
