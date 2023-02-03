<<<<<<< HEAD
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());

        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double priceLightsabersClear = Math.ceil(students + 0.10 * students) * priceLightsabers;
        double priceRobesFinal = students * priceRobes;

        double sumBelts = (students - students / 6) * priceBelts;


        double sum = priceLightsabersClear + priceRobesFinal + sumBelts;

        if (money >= sum) {
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", sum - money);
        }


    }

}
=======
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());

        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double priceLightsabersClear = Math.ceil(students + 0.10 * students) * priceLightsabers;
        double priceRobesFinal = students * priceRobes;

        double sumBelts = (students - students / 6) * priceBelts;


        double sum = priceLightsabersClear + priceRobesFinal + sumBelts;

        if (money >= sum) {
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", sum - money);
        }


    }

}
>>>>>>> 02d6b6877b193b4eb9bddb6b1008369e039491d1
