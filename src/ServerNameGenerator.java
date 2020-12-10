import java.util.Random;

public class ServerNameGenerator {



    public static void getRandomName(String[] Adjectives, String[] Nouns) {
        int randomAdjective = new Random().nextInt(Adjectives.length);
        String adjective = (Adjectives[randomAdjective]);
        int randomNoun = new Random().nextInt(Nouns.length);
        String noun = (Nouns[randomNoun]);
        System.out.printf("%s-%s", adjective, noun);
    }

    public static void main (String[] args) {

        String[] Adjectives = {"fast", "slow", "tall", "short", "red", "blue", "happy", "sad", "shiny", "dull"};

        String[] Nouns = {"chair", "desk", "laptop", "water bottle", "keys", "wallet", "phone", "cody the duck", "pens", "notebook"};

        getRandomName(Adjectives, Nouns);
    }

}
