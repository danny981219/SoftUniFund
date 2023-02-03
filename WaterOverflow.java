package JavaProgrammingFundamentals;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waterTankCapacity = 255;
        int n = Integer.parseInt(scanner.nextLine()); //lines

        int addedLiters = 0;
        for (int i = 0; i < n; i++) {
            int litters = Integer.parseInt(scanner.nextLine());
            if (litters <= waterTankCapacity){
                addedLiters += litters;
                waterTankCapacity -= litters;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }

        System.out.println(addedLiters);



    }
}
