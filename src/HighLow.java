import java.util.Scanner;
public class HighLow {
    public static void main(String[] args){
        int guess = (int)(Math.random()*100)+1;
        Scanner scanner = new Scanner((System.in));
        int userInput;
        do{
            System.out.println("Guess a number between 1 and 100");
            userInput = scanner.nextInt();
            if(userInput < guess){
                System.out.println("HIGHER");
            } else if (userInput> guess){
                System.out.println("LOWER");
            } else{
                System.out.println("GOOD GUESS");
            }
        } while (guess != userInput);
    }
}

