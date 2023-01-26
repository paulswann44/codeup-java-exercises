package grades;

public class StudentTest {
    public static void main(String[] args){
        Student paul = new Student("Paul");
        System.out.println(paul.getName());
        paul.addGrade(88);
        paul.addGrade(89);
        paul.addGrade(98);
        System.out.println(paul.getName());
        System.out.printf("%s's average grade is a %.2f%%%n", paul.getName(), paul.getGradeAverage());
    }
}
