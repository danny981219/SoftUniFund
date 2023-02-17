package JavaProgrammingFundamentals;

import java.util.Scanner;

public class TrainArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] peopleInWagons = new int[n];
        for (int i = 0; i < n; i++) {
            peopleInWagons[i] = Integer.parseInt(scanner.nextLine());
        }

        int totalPeople = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(peopleInWagons[i] + " ");
            totalPeople += peopleInWagons[i];
        }
        System.out.println();
        System.out.println(totalPeople);

    }

}
