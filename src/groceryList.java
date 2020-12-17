import java.util.ArrayList;

public class groceryList {

    private String category;
    private ArrayList<String> groceryList;


    public groceryList(String category) {
        this.category = category;
        this.groceryList = new ArrayList<>();
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(ArrayList<String> groceryList) {
        this.groceryList = groceryList;
    }

    public void addItem (String item) {
        this.groceryList.add(item);
    }
}


