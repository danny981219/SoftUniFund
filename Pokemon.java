package JavaProgrammingFundamentals;

import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine()); // poke power
        int distance = Integer.parseInt(scanner.nextLine()); // distance
        int exhaustFactor = Integer.parseInt(scanner.nextLine()); // exhaustion factor

        int startPower = power;
        double counter = 0;
        while (power >= distance) {
            power -= distance;
            counter++;

            if (power == startPower / 2 && exhaustFactor != 0) {
                power = power / exhaustFactor;
            }

        }

        System.out.println(power);
        System.out.println((int) counter);


    }
}
