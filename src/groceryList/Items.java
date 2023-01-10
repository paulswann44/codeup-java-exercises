package groceryList;

public class Items {
    private String categoryOfFood;
    private int quantity;
    private String name;


    public Items(String categoryOfFood, int quantity, String name) {
        this.categoryOfFood = categoryOfFood;
        this.quantity = quantity;
        this.name = name;
    }

    public String getCategoryOfFood() {
        return categoryOfFood;
    }

    public void setCategoryOfFood(String categoryOfFood) {
        this.categoryOfFood = categoryOfFood;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

