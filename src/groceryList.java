import java.util.ArrayList;

public class groceryList {

    private String category;
    private ArrayList<String> groceryList;


    public groceryList(String category) {
        this.category = category;
        this.groceryList = new ArrayList<>();
    }

    public String getCategory() {
        return category;
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(ArrayList<String> groceryList) {
        this.groceryList = groceryList;
    }
}


