import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
//        System.out.println(addition(1, 2));
//        System.out.println(subtract(2, 1));
//        System.out.println(division(2, 0));
//        System.out.println(division(2, 2));
//        System.out.println(getInteger(1, 10));
//        System.out.println(factorial());
        System.out.println(dice());

    }

    //a1
    public static int addition(int number1, int number2) {
        return number1 + number2;
    }

    //a2
    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    //a3
    public static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    //a
    public static String division(int numerator, int denominator) {
        if (denominator == 0) {
            return "undefined";
        }
        //store into two parts
        int quotient = numerator / denominator;
        int remainder = numerator % denominator;
        return quotient + "." + remainder;
    }

    //2
//    public static int getInteger(int min, int max) {
//        Scanner userInput = new Scanner(System.in);
//
//        System.out.println("Enter a number between " + min + " and " + max);
//        int userNumber = userInput.nextInt(); //open to recursion
//        System.out.println("Your Number is: " + userNumber);
//        if (userNumber < min | max > userNumber) {
//            System.out.println("That is not between 1-10... \n Try again!");
//            return userNumber; //This creates
//        }
//        System.out.println("Continue? [Y/N]");
//        String userDecision = userInput.next();
//        if (userDecision.equalsIgnoreCase("no")) {
//            return userNumber;
//        }
//        return getInteger(1, 10);
//    }

    public static int getInteger(int min, int max) {
        //Displays in Terminal
        System.out.println("Enter a number between: " + min + " and " + max);
        //Creates scanner object and takes in an input
        Scanner scanner = new Scanner(System.in);
        //Declares user input equals to scanner object and reads the input
        int userInput = scanner.nextInt();
        // if userInput is greater/equal too than the minimum && less than the maximum
        if (userInput >= min && userInput <= max) {
            // Will return input valid input
            return userInput;
        }
        //This will cause recursion
        return getInteger(min, max);
    }

    //3
    public static long factorial() {
        int NumToFactorialize = getInteger(1, 10);
        long currentSum = 1;
        for (int counter = 1; counter <= NumToFactorialize; counter++) {
            currentSum *= counter;
        }
        boolean userChoice = cont();
        if (userChoice) {
            factorial();
        }
        return currentSum;
    }

    public static boolean cont() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("would you like to go again?");
        String answer = scanner.nextLine();
        if (answer.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }
    //4
    public static int dice (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many side of dice?");
        int side = scanner.nextInt();
        int dice1= (int)((Math.random() *side)+1);
        int dice2= (int)((Math.random() *side)+1);
        return dice1 + dice2;
    }
}

