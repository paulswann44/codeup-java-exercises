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
