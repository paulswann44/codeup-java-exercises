package Lectures;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.Scanner;

public class ExceptionLecture {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number");
        try{
            int userNum =number.nextInt();
        } catch (InputMismatchException e){
            System.out.println("That was not a number");
        }
    }

}
