import java.util.Scanner;
public class Person {
    //field to assign name & encapsulated name
    private String name;

    public Person(String name){
        this.name=name;
    }

    public String getName(){  //gets the value from encapsulated
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("heyyyy my name is" + getName());
    }
    public static void main (String[] args){
        Person personOne= new Person ("Paul");
        System.out.println(personOne.getName());

        //1
//        Person person1 = new Person("John");
//        Person person2 = new Person("John") ;
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);


        //2
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        //3
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}

