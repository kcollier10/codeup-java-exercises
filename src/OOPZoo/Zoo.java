package OOPZoo;

public class Zoo {

    public static void main(String[] args) {

        Penguin kingPeng = new Penguin(28, "female", 20);
        kingPeng.fly();

        Macaw blueMacaw = new Macaw(12, "male", 4);
        blueMacaw.fly();
    }
}
