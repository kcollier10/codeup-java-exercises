package OOPZoo;

public class Penguin extends Bird {

    public Penguin(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    public void fly() {
        System.out.println("I can't fly :(");
    }
}
