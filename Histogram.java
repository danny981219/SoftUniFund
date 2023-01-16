package ForLoopExercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine()); //общ брой на числата

        //повтаряме за всяко число:
        //1. стойността на числото
        //2. проверяваме в коя група е
        //3. увеличаваме бр. на числата с 1
        //начало: 1
        //край: последното число = countNumbers
        //промяна: +1

        int count1 = 0; //бр. числа в първата група
        int count2 = 0; //бр. числа във втората група
        int count3 = 0; //бр. числа в третата група
        int count4 = 0; //бр. числа в четвъртата група
        int count5 = 0; //бр. числа в петата група

        for (int number = 1; number <= countNumbers; number++) {
            int value = Integer.parseInt(scanner.nextLine()); //стойността на числото
            //1 група -> < 200
            if (value < 200) {
                //попада в 1 група
                count1++;
            }
            //2 група -> >= 200 и <= 399
            else if (value >= 200 && value <= 399) {
                //попада в група 21
                count2++;
            }
            //3 група -> >= 400 и <= 599
            else if (value >= 400 && value <= 599) {
                //попада в група 3
                count3++;
            }
            //4 група -> >=600 и <= 799
            else if (value >= 600 && value <= 799) {
                //попада в група 4
                count4++;
            }
            //5 група -> >= 800
            else if (value >= 800) {
                //попада в група 5
                count5++;
            }
        }

        //какъв е броят на числата във всяка една група
        //процентът на числата във всяка една група -> бр. числа във съответната група / общ брой числа * 100
        double p1 = count1 * 1.0 / countNumbers * 100;
        double p2 = count2 * 1.0 / countNumbers * 100;
        double p3 = count3 * 1.0 / countNumbers * 100;
        double p4 = count4 * 1.0 / countNumbers * 100;
        double p5 = count5 * 1.0 / countNumbers * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);


    }
}