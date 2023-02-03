<<<<<<< HEAD
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String languageAbr = scanner.nextLine();

        switch (languageAbr) {
            case "USA":
            case "England":
                System.out.println("English");
                break;

            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }


    }
}
=======
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String languageAbr = scanner.nextLine();

        switch (languageAbr) {
            case "USA":
            case "England":
                System.out.println("English");
                break;

            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }


    }
}
>>>>>>> 02d6b6877b193b4eb9bddb6b1008369e039491d1
