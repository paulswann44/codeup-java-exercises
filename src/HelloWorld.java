import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args) {
        System.out.println("Hello World");

        //1
        // Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 1;
        System.out.println(myFavoriteNumber);

        //2
        //Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "I am a string.";
        System.out.println(myString);

//        3
//        Change your code to assign a character value to myString. What do you notice?
//        ANSWER: ERROR OCCURS
//        myString = 'c';
//        we are assigning the memory differently.  the 'c' storing to ascii code (machine values of 99).
//        The string is being converted to intiger.  It has to be stored as a char instead rather than as a string.


        // 4
//        Change your code to assign the value 3.14159 to myString. What happens?
//        myString = 3.14159
//                It is looking to store a string and not a float

//        5
//        Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber;
//        System.out.println(myNumber);
//        error:
//        might not have been initialized yet

//        6
//        Change your code to assign the value 3.14 to myNumber. What do you notice?
//        long myNumber = 3.14;
//                System.out.println(myNumber);
//        error: incompatable types


//        7
//        Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        long myNumber = 123L;
//                System.out.println(myNumber);


//        8
//        Change your code to assign the value 123 to myNumber.
//        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//        long myNumber = 123;
//                System.out.println(myNumber);
//        9
//        Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        long does not compensate for decimal point.  It needs whole numbers
//
//        float myNumber = 3.14;
//        It will read as an error.  float variable types compensates for decimal points
//
//
//        10
//        Copy and paste the following code blocks one at a time and execute them
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        What is the difference between the above code blocks? Explain why the code outputs what it does.

//        11
//        Try to create a variable named class. What happens?
//        int class....;
//        still waiting for name the class and class is a

//        12
//        Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
          String theNumberThree = "three";
          Object o = theNumberThree;
          int three = (int) o;

//        Copy and paste the code above and then run it. Does the result match with your expectation?
//        How is the above example different from the code block below?

//        int three = (int) "three";

//        Copy and paste the code above and then run it. Does the result match with your expectation?
//        How is the above example different from the code block below?



//        13
//        int x = 4;
//        x += 5;
//
//        int x = 3;
//        int y = 4;
//         y *= x;
//
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//
//      14
//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//
//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
//        int bigNum = 2147483647; //fits into int value
//        int bigNum2 = 2147483648; //past int buffer
//        int incBigNum2 = 2147483648;
//        incBigNum2++;
//        ++incBigNum2;
//
//        Scanner scanner = new Scanner(System.in); //scanner obj
//
//        System.out.print("Enter something: ");
////        String userInput = scanner.next();  //reads the entire line from the console
//        String userInput = scanner.nextLine(); //next item from the console
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");


    }

}

