package ProgrammingBasicsExercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pageWholeBook = Integer.parseInt(scanner.nextLine());
        int pageFor1hour = Integer.parseInt(scanner.nextLine());
        int daysForReadBook = Integer.parseInt(scanner.nextLine());

        System.out.println((pageWholeBook / pageFor1hour) / daysForReadBook);


    }
}
