//import java.util.Scanner;
//public class ControlFlowExercises {
//    public static void main(String[] args){
////        Loop Basics a. While loops
//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }
//        //Do while
//        int start = 0;
//        do {
//            System.out.println(start += 2);
//
//        }while(start < 100);
//
//        do {
//            System.out.println(start -= 5);
//        }while(start > -10 );
//
//        long startsAtTwo = 2;
//        do {
//            System.out.println(startsAtTwo);
//            startsAtTwo *= startsAtTwo;
//        }while(startsAtTwo < 1_000_000L);
//
//        for (int i = 5; i <= 15;i++){
//            System.out.println(i);
//        }
//        for (int i = 0; i <= 100; i+=2){
//            System.out.println(i);
//        }
//
//          for(int i = 100; i >= -10; i -=5){
//              System.out.println(i);
//          }
//
//            for (long i = 2; i < 1_000_000; i*=i){
//                System.out.println(i);
//            }
//
//        //FizzBuzz
//            for(int i =1; i <= 100; i++){
//                if(i % 3 == 0 & i % 5 == 0){
//                    System.out.println("FizzBuzz");
//                }
//                else if(i % 3 == 0){
//                    System.out.println("Fizz");
//                }else if(i % 5 == 0){
//                    System.out.println("Buzz");
//                }
//                else{
//                System.out.println(i);}
//
//                }
//
//         Scanner userInput = new Scanner(System.in);
//        //Table of powers
//        System.out.println("What number would you like to go up to?");
//        int userInt = userInput.nextInt();
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for(int i =1; i <= userInt;i++){
//            System.out.print(i+"      |");
//            System.out.print(i*i+"        |");
//            System.out.println(i*i*i);
//        }
//
//        System.out.println("would you like to continue? yes or no");
//        String userWishesToContinue = userInput.next();
//        if (userWishesToContinue.equalsIgnoreCase("yes")){
//            System.out.println("What number would you like to go up to?");
//            int userSecondInput = userInput.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for(int i =1; i <= userSecondInput;i++){
//                System.out.print(i+"      |");
//                System.out.print(i*i+"        |");
//                System.out.println(i*i*i);
//            }
//        }else{
//            System.out.println("See you again next time!");
//        };
//
//        System.out.println("Enter a grade from 0 to 100");
//        int userInt = userInput.nextInt();
//        if(userInt >= 88){
//            System.out.println("The grade for this score is an A");
//        }else if(userInt >= 80 ){
//            System.out.println("The grade for this score is a B");
//        }else if(userInt >= 67 ){
//            System.out.println("The grade for this score is a C");
//        }else if(userInt >= 60){
//            System.out.println("The grade for this score is a D");
//        }else{
//            System.out.println("The grade for this score is an F");
//        }
//
//    }
//}