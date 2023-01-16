package ForLoopExercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorsName = scanner.nextLine();
        double startPoints = Double.parseDouble(scanner.nextLine());
        int countJury = Integer.parseInt(scanner.nextLine());


        for (int jury = 1; jury <= countJury; jury++) {
            String juryName = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            double givenPoints = (juryName.length() * points) / 2;


            startPoints += givenPoints;


            if (startPoints >= 1250.5) {
                break;
            }
        }


        if (startPoints >= 1250.5) {

            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorsName, startPoints);
        } else {

            System.out.printf("Sorry, %s you need %.1f more!", actorsName, 1250.5 - startPoints);

        }


    }
}
