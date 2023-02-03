package JavaProgrammingFundamentals;

import java.util.Scanner;

public class TreasureHuntArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] initialLoot = scanner.nextLine().split("\\|");

        String command = scanner.nextLine(); // cqlata komanda ot konzolata

        while (!command.equals("Yohoho!")) {
            String[] commandParts = command.split(" "); // chastite na komandata
            String commandName = commandParts[0]; // imeto na komandata - /Loot /Drop /Steal

            switch (commandName) {
                case "Loot":
                    break;
                case "Drop":
                    int dropIndex = Integer.parseInt(commandParts[1]);
                    if (dropIndex < 0 || dropIndex >= commandParts.length - 1) {
                        break;
                    } else {
                        String currentLoot = initialLoot[dropIndex];
                        for (int leftIndex = dropIndex; leftIndex < initialLoot.length - 1; leftIndex++) {
                            initialLoot[leftIndex] = initialLoot[leftIndex + 1];
                        }
                        initialLoot[initialLoot.length -1] = currentLoot;
                    }
                    break;
                case "Steal":
                    break;

            }


            command = scanner.nextLine();
        }


    }
}
