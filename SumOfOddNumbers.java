<<<<<<< HEAD
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 != 0){
                System.out.println(i);
                sum += i;
            }
            if (i == n * 2){
                System.out.printf("Sum: %d", sum);
            }
        }

    }
}
=======
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 != 0){
                System.out.println(i);
                sum += i;
            }
            if (i == n * 2){
                System.out.printf("Sum: %d", sum);
            }
        }

    }
}
>>>>>>> 02d6b6877b193b4eb9bddb6b1008369e039491d1
