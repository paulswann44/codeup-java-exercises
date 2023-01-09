package grades;

import java.util.ArrayList;


public class Student {
    private String Name;
    private ArrayList<Integer> grades = new ArrayList<>();


    //Constructor
    public Student(String name) {
        this.Name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.Name;

    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
            average = sum / grades.size();
        }
        return average;
    }




}


//Welcome!
//
//        Here are the GitHub usernames of our students:
//
//        |zgulde| |ryanorsinger| |jreich5| |fmendozaro| |MontealegreLuis|
//
//        What student would you like to see more information on?
//
//        > pizza
//
//        Sorry, no student found with the GitHub username of "pizza".
//
//        Would you like to see another student?
//
//        > y
//
//        What student would you like to see more information on?
//
//        > zgulde
//
//        Name: Zach - GitHub Username: zgulde
//        Current Average: 87.4
//
//        Would you like to see another student?
//
//        > no
//
//        Goodbye, and have a wonderful day!