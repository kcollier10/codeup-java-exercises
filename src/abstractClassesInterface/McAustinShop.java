package abstractClassesInterface;

import java.util.List;

public class McAustinShop implements McFranchise {
    // properties
    private List<String> menuItems;
    private List<String> menuCategories;
    private int seatingCapacity;
    private int openTime;
    private int closeTime;
    private boolean isWorking;

    // Constructor


    public McAustinShop(List<String> menuItems, List<String> menuCategories, int seatingCapacity, int openTime, int closeTime, boolean isWorking) {
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.seatingCapacity = seatingCapacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.isWorking = isWorking;
    }

    @Override
    public void broilStuff(String menuItem) {
        System.out.printf("The hipster kitchen just whipped up a: %s\n", menuItem);
    }

    @Override
    public void businessHours(int openTime, int closeTime) {
        System.out.printf("Our store is open from %d to %d.\n", openTime, closeTime);
    }

    @Override
    public String iceCreamMachineWorking() {
        if (this.isWorking) {
            return "Austin's ice cream machine is on!";
        } else {
            return "Austin's ice cream machine is also broken.";
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
