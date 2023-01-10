package groceryList;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Establishing the list of categories
        ArrayList<String> categories = new ArrayList<>();
        categories.add("Produce");
        categories.add("Meat");
        categories.add("Dairy");
        categories.add("Bakery");
        categories.add("Other");


        //List for inputs to be stored in a list of groceryList
        ArrayList<Items> groceryList = new ArrayList<>();
        System.out.print("Would you like to create a grocery list? (y/n) ");
        String createList = scanner.nextLine();


        //if loop = true than while loop will start and get user inputs to build list
        if (createList.equalsIgnoreCase("y")) {
            boolean addItem = true;


            //While loop because it will reprompt if true
            while (addItem) {
                System.out.println("Select a category:");


//                It loops through the categories arrayList of ["Produce", "Meat", "Dairy", "Bakery", "Other"]
                for (int i = 0; i < categories.size(); i++) {
                    System.out.println((i + 1) + ". " + categories.get(i));
                    /* OUTPUT:
                    * 1. Produce
                    * 2. Meat
                    * 3. Dairy
                    * 4. Bakery
                    * 5. Other
                    * */
                }

                //This stores the category number input above 1,2,3,4,5
                int categoryNumber = scanner.nextInt();
                scanner.nextLine();
                //To get the correct index from the user, we need to subtract 1 from the user
                String category = categories.get(categoryNumber - 1);

                //Stores Item Name within a String
                System.out.print("Enter the name of the item: ");
                String item = scanner.nextLine();

                //Stores Qty within an interger
                System.out.print("Enter the quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();


                //Calls a new object using the constructor
                Items newItem = new Items(category, quantity, item);
                groceryList.add(newItem);

                System.out.print("Would you like to add another item? (y/n) ");
                String addAnother = scanner.nextLine();
                if (addAnother.equalsIgnoreCase("n")) {
                    addItem = false;
                }
            }


            //This iterates each item w/in the grocery list utilizes the getters for getting category, name, and quantity
            for (Items item : groceryList) {
                System.out.println("*******SHOPPING LIST*****");
                System.out.println(item.getCategoryOfFood() + ":");
                System.out.println("  " + item.getName() + " --- " + item.getQuantity());
                System.out.println("*************************");

            }
        }
    }
}
