package JavaProgrammingFundamentals;

import java.util.Scanner;

public class GradesMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gradeInput = Double.parseDouble(scanner.nextLine());


        gradeToWord(gradeInput);
    }

    public static void gradeToWord(double gradeInput) {
        if (gradeInput >= 2.00 && gradeInput <= 2.99) {
            System.out.println("Fail");
        } else if (gradeInput <= 3.49) {
            System.out.println("Poor");
        } else if (gradeInput <= 4.49) {
            System.out.println("Good");
        } else if (gradeInput <= 5.49) {
            System.out.println("Very good");
        }else if (gradeInput >= 5.50 && gradeInput <= 6.00){
            System.out.println("Excellent");
        }
    }
}
