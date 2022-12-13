import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.",pi);

        Scanner userInput = new Scanner(System.in);
//        System.out.println("Enter an integer!");
//        int userInt = userInput.nextInt();
//        System.out.println("You entered: " + userInt);

//        System.out.println("Enter 3 words!");
//        String firstWord = userInput.next();
//        String secondWord = userInput.next();
//        String thirdWord = userInput.next();
//
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);

//        System.out.println("Enter a sentence!");
//        String userSentence = userInput.nextLine();
//        System.out.println(userSentence);

        System.out.println("Enter the length of your room in feet!");
        int length = userInput.nextInt();
        System.out.println("the length is " + length + " feet long");
        System.out.println("Enter the width of your room in feet!");
        int width = userInput.nextInt();
        System.out.println("The width of your room is " + width + " feet long");

        System.out.println("The area of your room is " + (length * width) + " feet");
        System.out.println("The perimeter of your room is " + (length*2 + width*2) + " feet");


    }
}