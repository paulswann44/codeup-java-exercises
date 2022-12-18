//import java.util.Scanner;
//public class Bob {
//    public static void main (String [] arg){
//        Scanner userInput = new Scanner(System.in);
//
//        String one = "Sure";
//        String two = "Whoa, chill out!' if you yell at him.";
//        String three = "Fine. Be that way!";
//        String four = "Whatever.";
//        //Bob's responses
//
//
//
//        //initial question
//        System.out.println("What would you like to ask Bob? [Y/N]");
//
//
//
//        //initial response
//
//
//        while(userResponse.equalsIgnoreCase("yes")){
//            System.out.println("Awesome! Let's talk to Bob!");
//            String userTalking = userInputs.nextLine();
//            if(userTalking.endsWith("?")){
//                System.out.println(one);
//            }else if(userTalking.endsWith("!")){
//                System.out.println(two);
//            }else if(userTalking.length() == 0){
//                System.out.println(three);
//            }else{
//                System.out.println(four);
//            }
//            System.out.println("Would you still like to talk to Bob?");
//            userResponse = userInput.nextLine();
//        }
//        System.out.println("Okay maybe next time!");
//
//    }
//}


//in-class solution
import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;



        System.out.println("What would you like to ask Bob? ");

        input = sc.nextLine();

        if (input.contains("?")) {
            System.out.println("Sure");
        } else if (input.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (input.equals("")) { // can use isEmpty() built in method
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}