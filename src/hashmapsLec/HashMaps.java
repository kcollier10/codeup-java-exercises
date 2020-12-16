package hashmapsLec;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        // We'll start by defining a hash map
        HashMap<String, String> usernames = new HashMap<>();

        // and putting some data into it
        usernames.put("Ryan", "ryanorsinger");
        usernames.put("Zach", "zgulde");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Justin", "jreich5");

        System.out.println(usernames);
        // TODO: Add more key-value pairs to usernames
        usernames.put("Kristen", "k10");
        usernames.put("Jake", "jacob");
        usernames.put("Chief", "pup");

        // obtaining values from the hash map by key
        // TODO: Get the value stored in key "Ryan"
        System.out.println(usernames.get("Ryan"));
        // TODO: Get the value stored in key "Phillip". What is the result?
        System.out.println(usernames.get("Phillip"));
        // null

        usernames.getOrDefault("yolo", "gocodeup");
//        usernames.getOrDefault("Jason", "gocodeup"); // "gocodeup"

        // checking if keys or values are present
        // TODO: Check if key "Justin" exists in the HashMap
        System.out.println(usernames.containsKey("Justin"));
        // TODO: Check if the value "fmendozaro"
        System.out.println(usernames.containsValue("fmendozaro"));

        usernames.put("Ryan", "ryanorsinger");

        System.out.println(usernames); // {Ryan=ryanorsinger}

        usernames.putIfAbsent("Zach", "zgulde");
        usernames.putIfAbsent("Zach", "coderdude24");
        System.out.println(usernames); // {Ryan=ryanorsinger, Zach=zgulde}

        // TODO: Remove key "Zach" and the value associated with it
        usernames.remove("Zach");
        System.out.println(usernames); // {Ryan=ryanorsinger}

        // TODO: Replace Ryan's username with "torvalds"
        usernames.replace("Ryan", "torvalds");
        System.out.println(usernames); // {Ryan=torvalds}

        usernames.clear();
        System.out.println(usernames);
        System.out.println(usernames.isEmpty());
    }
}

// when you put things in a hashmap, there is no specific order