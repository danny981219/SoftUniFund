package ProgrammingBasics;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int project = Integer.parseInt(scanner.nextLine());
        int hours = 3 * project;

        System.out.println("The architect " + name + " will need " + hours + " hours to complete " + project + " project/s.");



    }
}
