import java.util.Arrays;

public class ArraysExercises {
    //a-1
//This way works just fine.
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
//        RESULTS:
//        1
//        2
//        3
//        4
//        5

//a-2
//use What happens when you run the following code? Why is Arrays.toString necessary?
//        public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers)); // RESULTS: [1, 2, 3, 4, 5]

//a-3
//Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
        String[] persons = {"Paul", "David", "Sam"};
        String[] newPerson = new String[persons.length + 1];
        for (String person : persons) {
            System.out.println(person);
//            RESULTS:
//            Paul
//            David
//            Sam
        }

    }

    //a-4
    //Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

//    public static String[] addPerson(String[] person, String newName) {
//        //creating a new String object with an increase in length size
//        String[] newPersons = new String[person.length + 1];
//        //Copy it by a loop
//        for (int i = 0; i < person.length; i++) {
//            //copying to newPerson
//            newPersons[i] = person[i];
//        }
//
//        newPersons[newPersons.length - 1]= newName;
//        return newPersons;
//
//
//    }

public static Person[] addPerson(Person[] newPerson, Person newName){
        Person[] newArray = Arrays.copyOf(newPerson, newPerson.length +1);
        newArray[newPerson.length] = newName;
        return newArray;
}
}

