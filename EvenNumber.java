<<<<<<< HEAD
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        while (num % 2 != 0) {
            System.out.println("Please write an even number.");
            num = Integer.parseInt(scanner.nextLine());
        }

        System.out.printf("The number is: %d", Math.abs(num));


    }
}
=======
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        while (num % 2 != 0) {
            System.out.println("Please write an even number.");
            num = Integer.parseInt(scanner.nextLine());
        }

        System.out.printf("The number is: %d", Math.abs(num));


    }
}
>>>>>>> 02d6b6877b193b4eb9bddb6b1008369e039491d1
