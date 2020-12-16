//package abstractClassesInterface;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class OnlyRunThings {
//
//    public static void main(String[] args) {
//        // Let's try to access some of McBurgerShop's items/methods
//        List<String> theseMenuItems = new ArrayList<>();
//        theseMenuItems.add("Big Mac");
//        theseMenuItems.add("French Fries");
//        theseMenuItems.add("Quarter Pounder");
//        List <String> theseCategories = new ArrayList<>();
//        theseCategories.add("Entrees");
//        theseCategories.add("Sides");
//        theseCategories.add("Desserts");
//        McBurgerShop mcDonaldsDallas = new McBurgerShop(theseMenuItems, theseCategories, 200, 800, 2300, true);
//
//        Franchise.broilStuff("Big Mac", 43);
//
//        // Loop through all of the menu items and print each one of them to the screen
//        for (String thisItem : mcDonaldsDallas.getMenuItems()) {
//            // running broilStuff() method on
//            mcDonaldsDallas.broilStuff(thisItem);
//            // Looking at one menu item at a time
////            System.out.printf("Menu item: %s\n", thisItem);
//        }
//}
