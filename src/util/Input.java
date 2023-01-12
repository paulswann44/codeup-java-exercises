package util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine();
    }

    public static boolean yesNo() {
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("si");
    }

    public static int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d", min, max);
        int userNumber = scanner.nextInt();
        if (userNumber < min || userNumber > max) {
            getInt(min, max);
        }
        return userNumber;

    }

//    public static int getInt(){
//        return scanner.nextInt();
//    }

    public static int getInt() {
        System.out.println("Enter an integer value");
        String s = getString();
//        int intVal = 0;
        int intVal = 0;
        try {
            intVal = Integer.valueOf(s);

        } catch (Exception e) {  //<---- catching the error with a pr
            System.out.println("Invalid input, try again" + e);
            getInt();
        }

        return intVal;
    }


    public static double getDouble(double min, double max) {
        System.out.printf("Enter a number between %s and %s", min, max);
        double userNumber = scanner.nextDouble();
        if (Double.compare(userNumber, min) < 0 || Double.compare(userNumber, max) > 0) {
            getDouble(min, max);
        }
        return userNumber;
    }

    //    public static double getDouble(){
//        return scanner.nextDouble();
//
//    }
    public static double getDouble() {
        System.out.println("Enter a double value: ");
        String stringVal = getString();
        double doubleVal = 0;
        try {
            doubleVal = Double.valueOf(stringVal);

        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
        return doubleVal;
    }

}