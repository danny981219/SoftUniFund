package MoreConditionalStatements3;

import java.util.Scanner;

public class OnTimefortheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourOfExam = Integer.parseInt(scanner.nextLine());
        int minuteOfExam = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minuteOfArrival = Integer.parseInt(scanner.nextLine());


        int totalMin = hourOfExam * 60 + minuteOfExam;
        int totalMinA = hourOfArrival * 60 + minuteOfArrival;
        int diff = totalMin - totalMinA;

        if (diff == 0) {
            System.out.println("On time");
        } else if (diff > 0 && diff <= 30) {
            System.out.printf("On time%n%d minutes before the start", Math.abs(diff));
        } else if (diff < 0) {
            diff = Math.abs(diff);
            System.out.println("Late");
            if (diff >= 60) {
                hourOfExam = diff / 60;
                minuteOfExam = diff % 60;
                System.out.printf("%d:%02d hours after the start", hourOfExam, minuteOfExam);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }
        } else {
            System.out.println("Early");
            if (diff >= 60){
                hourOfExam = diff / 60;
                minuteOfExam = diff % 60;
                System.out.printf("%d:%02d hours before the start", hourOfExam, minuteOfExam);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }
        }


    }

}