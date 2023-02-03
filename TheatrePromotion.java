<<<<<<< HEAD
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (day) {
            case "weekday":
                if (age >= 0 & age <= 18) {
                    price = 12;
                }
                if (age > 18 & age <= 64) {
                    price = 18;
                }
                if (age > 64 & age <= 122) {
                    price = 12;
                }
                break;
            case "weekend":
                if (age >= 0 & age <= 18) {
                    price = 15;
                }
                if (age > 18 & age <= 64) {
                    price = 20;
                }
                if (age > 64 & age <= 122) {
                    price = 15;
                }
                break;
            case "holiday":
                if (age >= 0 & age <= 18) {
                    price = 5;
                }
                if (age > 18 & age <= 64) {
                    price = 12;
                }
                if (age > 64 & age <= 122) {
                    price = 10;
                }
                break;

        }
        if (price != 0) {
            System.out.printf("%.0f$", price);
        } else {
            System.out.println("Error!");
        }
    }
}


/*
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        if ("Weekday".equals(day)) {
            if (age >= 0 & age <= 18) {
                price = 12;
            }
            if (age >= 18 & age <= 64) {
                price = 18;
            }
            if (age >= 64 & age <= 122) {
                price = 12;
            }
        } else if ("Weekend".equals(day)) {
            if (age >= 0 & age <= 18) {
                price = 15;
            }
            if (age >= 18 & age <= 64) {
                price = 20;
            }
            if (age >= 64 & age <= 122) {
                price = 15;
            }
        } else if ("Holiday".equals(day)) {
            if (age >= 0 & age <= 18) {
                price = 5;
            }
            if (age >= 18 & age <= 64) {
                price = 12;
            }
            if (age >= 64 & age <= 122) {
                price = 10;
            }
        }
        if (price != 0) {
            System.out.printf("%.0f$", price);
        } else  {
            System.out.println("Error!");
        }


    }
}
*/
=======
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (day) {
            case "weekday":
                if (age >= 0 & age <= 18) {
                    price = 12;
                }
                if (age > 18 & age <= 64) {
                    price = 18;
                }
                if (age > 64 & age <= 122) {
                    price = 12;
                }
                break;
            case "weekend":
                if (age >= 0 & age <= 18) {
                    price = 15;
                }
                if (age > 18 & age <= 64) {
                    price = 20;
                }
                if (age > 64 & age <= 122) {
                    price = 15;
                }
                break;
            case "holiday":
                if (age >= 0 & age <= 18) {
                    price = 5;
                }
                if (age > 18 & age <= 64) {
                    price = 12;
                }
                if (age > 64 & age <= 122) {
                    price = 10;
                }
                break;

        }
        if (price != 0) {
            System.out.printf("%.0f$", price);
        } else {
            System.out.println("Error!");
        }
    }
}


/*
package JavaProgrammingFundamentals;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        if ("Weekday".equals(day)) {
            if (age >= 0 & age <= 18) {
                price = 12;
            }
            if (age >= 18 & age <= 64) {
                price = 18;
            }
            if (age >= 64 & age <= 122) {
                price = 12;
            }
        } else if ("Weekend".equals(day)) {
            if (age >= 0 & age <= 18) {
                price = 15;
            }
            if (age >= 18 & age <= 64) {
                price = 20;
            }
            if (age >= 64 & age <= 122) {
                price = 15;
            }
        } else if ("Holiday".equals(day)) {
            if (age >= 0 & age <= 18) {
                price = 5;
            }
            if (age >= 18 & age <= 64) {
                price = 12;
            }
            if (age >= 64 & age <= 122) {
                price = 10;
            }
        }
        if (price != 0) {
            System.out.printf("%.0f$", price);
        } else  {
            System.out.println("Error!");
        }


    }
}
*/
>>>>>>> 02d6b6877b193b4eb9bddb6b1008369e039491d1
