package JavaProgrammingFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationsBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String command = scanner.nextLine();

        while(!command.equals("end")){

            if (command.contains("Add")){
                int elementToAdd = Integer.parseInt(command.split(" ")[1]);
                integerList.add(elementToAdd);

            }else if (command.contains("RemoveAt")) {
                int elementToRemoveAt = Integer.parseInt(command.split(" ")[1]);
                integerList.remove(elementToRemoveAt);

            } else if (command.contains("Remove")){
                int elementToRemove = Integer.parseInt(command.split(" ")[1]);
                integerList.remove(Integer.valueOf(elementToRemove));

            } else if (command.contains("Insert")){
               String[] commandParts = command.split(" ");

                int number = Integer.parseInt(commandParts[1]);
                int index = Integer.parseInt(commandParts[2]);

                integerList.add(index, number);
            }
            command = scanner.nextLine();
        }

        for (Integer number : integerList) {
            System.out.print(number + " ");
        }

    }
}
