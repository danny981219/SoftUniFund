package JavaProgrammingFundamentals;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int fullCourses = people / capacity;

        if (people % capacity != 0) {
            fullCourses += 1;
        }

        System.out.println(fullCourses);


    }
}
