<<<<<<< HEAD
package JavaProgrammingFundamentals;

import java.util.Scanner;
import java.util.function.DoubleFunction;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadset = lostGames / 2;
        int countMouse = lostGames / 3;
        int countKeyboards = lostGames / 6;
        int countDisplay = lostGames / 12;

        double finalSum = (countHeadset * headsetPrice) + (countMouse * mousePrice) + (countKeyboards * keyboardPrice) + (displayPrice * countDisplay);

        System.out.printf("Rage expenses: %.2f lv.", finalSum);




    }
}
=======
package JavaProgrammingFundamentals;

import java.util.Scanner;
import java.util.function.DoubleFunction;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadset = lostGames / 2;
        int countMouse = lostGames / 3;
        int countKeyboards = lostGames / 6;
        int countDisplay = lostGames / 12;

        double finalSum = (countHeadset * headsetPrice) + (countMouse * mousePrice) + (countKeyboards * keyboardPrice) + (displayPrice * countDisplay);

        System.out.printf("Rage expenses: %.2f lv.", finalSum);




    }
}
>>>>>>> 02d6b6877b193b4eb9bddb6b1008369e039491d1
