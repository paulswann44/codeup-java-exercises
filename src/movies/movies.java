package movies;

public class movies {
    private String name;
    private String catagory;

    //Default Constructor
    public movies() {

    }

    //Constructor
    public movies(String name, String catagory) {
        this.name = name;
        this.catagory = catagory;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getCatagory() {
        return catagory;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    //    public class MovieApplication {
    public static void main(String[] args) {

    }
}




