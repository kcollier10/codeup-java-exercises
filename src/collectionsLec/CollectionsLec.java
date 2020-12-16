package collectionsLec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class CollectionsLec {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(23,46,76,12,99));
        for(int num:nums) {
            System.out.println(num);
        }

        HashMap<Character, String> answers = new HashMap<>();

        answers.put('A', "Hello");
        answers.put('B', "Hi");
        answers.put('C', "Hey");
        answers.put('D', "Hello");
        answers.put('E', "Sup");

        System.out.println(answers.get('C'));

        System.out.println(answers.keySet());
        Set<Character> keys = answers.keySet();

        for(Character key:keys) {
            if(answers.get(key).equals("Jimbo")) {
                System.out.println(key);
            }
        }
    }
}
