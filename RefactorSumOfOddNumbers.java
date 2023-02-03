<<<<<<< HEAD
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i <= n-1; i++) {
            System.out.printf("%d%n",2 * i + 1);
            sum += (2 * i) + (1) ;
        }
        System.out.printf("Sum: %d%n", sum);

    }

=======
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i <= n-1; i++) {
            System.out.printf("%d%n",2 * i + 1);
            sum += (2 * i) + (1) ;
        }
        System.out.printf("Sum: %d%n", sum);

    }

>>>>>>> 02d6b6877b193b4eb9bddb6b1008369e039491d1
}