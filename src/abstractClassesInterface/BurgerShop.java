package abstractClassesInterface;

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
        BurgerShop myShop = new BurgerShop();
    }

    // Getters and setters

}
