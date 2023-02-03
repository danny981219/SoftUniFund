<<<<<<< HEAD
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if (minutes <= 29) {
            minutes = minutes + 30;
        } else if (minutes >= 30 & minutes <= 59) {
            minutes = minutes - 30;
            hours = hours + 1;

        }

        if (hours >= 24) {
            hours = hours - 24;

        }

        if (minutes >= 0 & minutes <= 9) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {

            System.out.printf("%d:%d", hours, minutes);
        }

    }
}
=======
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if (minutes <= 29) {
            minutes = minutes + 30;
        } else if (minutes >= 30 & minutes <= 59) {
            minutes = minutes - 30;
            hours = hours + 1;

        }

        if (hours >= 24) {
            hours = hours - 24;

        }

        if (minutes >= 0 & minutes <= 9) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {

            System.out.printf("%d:%d", hours, minutes);
        }

    }
}
>>>>>>> 02d6b6877b193b4eb9bddb6b1008369e039491d1
