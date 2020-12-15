package abstractClassesInterface;

import java.util.ArrayList;
import java.util.List;

public class McBurgerShop implements McFranchise {

    private List<String> menuItems;
    private List<String> menuCategories;
    private int seatingCapacity;
    private int openTime;
    private int closeTime;
    private boolean isWorking;

    public static void main(String[] args) {
        // Let's try to access some of McBurgerShop's items/methods
        List<String> theseMenuItems = new ArrayList<>();
        theseMenuItems.add("Big Mac");
        theseMenuItems.add("French Fries");
        theseMenuItems.add("Quarter Pounder");
        List <String> theseCategories = new ArrayList<>();
        theseCategories.add("Entrees");
        theseCategories.add("Sides");
        theseCategories.add("Desserts");
        McBurgerShop mcDonaldsDallas = new McBurgerShop(theseMenuItems, theseCategories, 200, 800, 2300, true);

        // Loop through all of the menu items and print each one of them to the screen
        for (String thisItem : mcDonaldsDallas.getMenuItems()) {
            // running broilStuff() method on
            mcDonaldsDallas.broilStuff(thisItem);
            // Looking at one menu item at a time
//            System.out.printf("Menu item: %s\n", thisItem);
        }

    // Create instance of McAustinShop that implements methods SLIGHTLY different than McBurgerShop
    McAustinShop austinMcDonalds = new McAustinShop(theseMenuItems, theseCategories, 400, 700, 2100, false);
        for(String thisItem: austinMcDonalds.getMenuItems()) {
            austinMcDonalds.broilStuff(thisItem);
        }

    }

    // Constructor
    public McBurgerShop (List <String> menuItems, List <String> menuCategories, int seatingCapacity, int openTime, int closeTime, boolean isWorking) {
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.seatingCapacity = seatingCapacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.isWorking = isWorking;
    }


    // Overrides
    @Override
    public void broilStuff(String menuItem) {
        System.out.printf("The kitchen just cooked an order of: %s\n", menuItem);
    }

    @Override
    public void businessHours(int openTime, int closeTime) {
        System.out.printf("Hours are between %d and %d\n", openTime, closeTime);

    }

    @Override
    public String iceCreamMachineWorking() {
        if (this.isWorking) {
            return "Time for ice cream!";
        } else {
            return "No ice cream for you!";
        }
    }

    public List<String> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<String> menuItems) {
        this.menuItems = menuItems;
    }

    public List<String> getMenuCategories() {
        return menuCategories;
    }

    public void setMenuCategories(List<String> menuCategories) {
        this.menuCategories = menuCategories;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getOpenTime() {
        return openTime;
    }

    public void setOpenTime(int openTime) {
        this.openTime = openTime;
    }

    public int getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(int closeTime) {
        this.closeTime = closeTime;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }
}
