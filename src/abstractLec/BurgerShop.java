package abstractLec;

import java.util.ArrayList;
import java.util.List;

// Burger Shop will be the "San Antonio" installation of a franchise
public class BurgerShop extends Franchise {
    // This will be an ACTUAL McDonald's store
    // It has to follow all the 'rules' set in the "Franchise" abstract class

    // properties (can have as many custom as we want)
    private List<String> menuItems;
    private List<String> menuCategories;
    private int seatingCapacity;
    private int openTime;
    private int closeTime;
    private boolean isWorking;


    // We'll need: constructor, override methods, getters and setters

    // Constructor
    public BurgerShop(String managerName, List<String> menuItems, List<String> menuCategories, int seatingCapacity, int openTime, int closeTime, boolean isWorking) {
        super(managerName);
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.seatingCapacity = seatingCapacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.isWorking = isWorking;
    }

    //Override the methods that have to be written, per the 'Franchise' abstract class
    // Use Override keyword to help yourself down the code
    @Override
    public void broilStuff(String menuItem) {
        System.out.printf("Items are being cooked: %s", menuItem);
    }

    @Override
    public void businessHours(int openTime, int closeTime) {
        System.out.printf("Hours are between %d and %d", openTime, closeTime);

    }

    @Override
    public boolean iceCreamMachineWorking() {
        System.out.println("Lol of course the ice cream machine isn't working.");
        // this *could* just be replaced by a getter, but to make it more complex, we could also check if the store is open and THEN return true
        if (this.openTime > 100) {
            return this.isWorking;
        }
        return false;
    }


    public static void main(String[] args) {
        List<String> theseMenuItems = new ArrayList<>();
        theseMenuItems.add("Big Mac");
        theseMenuItems.add("French Fries");
        List <String> theseCategories = new ArrayList<>();
        theseCategories.add("Entrees");
        theseCategories.add("Sides");
        BurgerShop mcDonaldsSanAntonio = new BurgerShop("Casey Friday", theseMenuItems, theseCategories, 200, 800, 2200, true);
        mcDonaldsSanAntonio.setManagerName("Vivian Canales");
    }

    // Getters and setters
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
