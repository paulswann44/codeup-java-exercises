package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {


    public static void main(String[] args) {


        HashMap<String, Student> students = new HashMap<>();

        Student paul = new Student("Paul");
        paul.addGrade(33);
        paul.addGrade(11);
        paul.addGrade(57);

        Student david = new Student("david");
        david.addGrade(80);
        david.addGrade(90);
        david.addGrade(95);

        Student danielle = new Student("Jenny");
        danielle.addGrade(99);
        danielle.addGrade(90);
        danielle.addGrade(88);




        students.put("Paul7", paul);
        students.put("David7", david);
        students.put("Danielle7", danielle);
    // User Interface
    String choice = "y";
    do {
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println(students.keySet());
        System.out.println("What student would you like to see more information on?");

        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();

        if(students.get(username) == null) {
            System.out.println("No users with that username found");
        } else {
            System.out.println(students.get(username) + " Git username: " + username);
        }

        System.out.println("Do you wish to continue? y/n: ");
        choice = sc.nextLine();
    }
        while (choice.equalsIgnoreCase("y"));





}

}

