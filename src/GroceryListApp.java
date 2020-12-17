import util.Input;

import java.util.HashMap;

public class GroceryListApp {

    public static void main(String[] args) {

        HashMap<String, groceryList> items = new HashMap<>();

        groceryList fruits = new groceryList("Fruits");
        groceryList veggies = new groceryList("Veggies");
        groceryList petStuff = new groceryList("Pet Stuff");
        groceryList toiletries = new groceryList("Toiletries");

        fruits.addItem("bananas");
        fruits.addItem("strawberries");
        fruits.addItem("kiwi");
        fruits.addItem("apples");
        fruits.addItem("oranges");
        items.put("Fruits", fruits);

        veggies.addItem("tomatoes");
        veggies.addItem("potatoes");
        veggies.addItem("celery");
        veggies.addItem("onions");
        veggies.addItem("garlic");
        items.put("Veggies", veggies);

        petStuff.addItem("Chief food");
        petStuff.addItem("Kitty food");
        petStuff.addItem("Chief toy");
        petStuff.addItem("Kitty toy");
        petStuff.addItem("treats!");
        items.put("Pet Stuff", petStuff);

        toiletries.addItem("shampoo");
        toiletries.addItem("conditioner");
        toiletries.addItem("deodorant");
        toiletries.addItem("brush");
        toiletries.addItem("lotion");
        items.put("Toiletries", toiletries);


        Input userInput = new Input();

        System.err.println("**************************************");
        System.out.println("Would you like to create a grocery list?");
        System.err.println("**************************************");

        boolean userMakeList = userInput.yesNo("Type 'y' to create list, type 'n' to exit.");

        do{
            if(!userMakeList) {
                System.out.println("Have a great day!");
            } else {
                // run function here to get user input value
                categoryList();
            }


        }while(userInput);



    }


}
