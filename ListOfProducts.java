package JavaProgrammingFundamentals;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // broi na produktite

        List<String> products = new ArrayList<>(); // spisak s produkti

        for (int i = 1; i <= n; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }

        Collections.sort(products);

        int number = 1;
        for (String product : products) {
            System.out.println(number + "." + product);
            number++;
        }
    }
}
