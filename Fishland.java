package Lesson1ProgrammingBasics.ProgrammingBasicsBonus;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double cenaSkumriq = Double.parseDouble(scanner.nextLine());
        double cenaCaca = Double.parseDouble(scanner.nextLine());

        double cenaPalamudKG = (0.60 * cenaSkumriq) + cenaSkumriq;
        double cenaSafridKG = (0.80 * cenaCaca) + cenaCaca;
        double cenaMidi = 7.50;

        double palamudAll = Double.parseDouble(scanner.nextLine()) * cenaPalamudKG;
        double safridALL = Double.parseDouble(scanner.nextLine()) * cenaSafridKG;
        double kgMidi = Double.parseDouble(scanner.nextLine()) * 7.50;

        double obshtaCena = safridALL + palamudAll + kgMidi;

        System.out.printf("%.2f", obshtaCena);


    }
}
