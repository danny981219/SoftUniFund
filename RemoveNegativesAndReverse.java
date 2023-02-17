package JavaProgrammingFundamentals;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> positiveNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }

        Collections.reverse(positiveNumbers);


        if (positiveNumbers.size() == 0) {
            System.out.println("empty");
        } else {
            System.out.println(positiveNumbers.toString()
                    .replace("[", "")
                    .replace("]", "")
                    .replaceAll(",", ""));
        }
    }
}
