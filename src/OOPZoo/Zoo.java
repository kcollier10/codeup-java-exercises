package OOPZoo;

public class Zoo {

    public static void main(String[] args) {

        Animal animal1 = new Animal(12, "Female", 5);
        animal1.eat();
        animal1.sleep();

        Fish seaBass = new Fish(100, "male", 1);
        seaBass.eat();
        seaBass.sleep();
        seaBass.swim();

        Bird bird1 = new Bird(10, "female", 4);
        bird1.eat();
        bird1.sleep();


        Penguin kingPeng = new Penguin(28, "female", 20);
        kingPeng.eat();
        kingPeng.sleep();
        kingPeng.fly();

        Macaw blueMacaw = new Macaw(12, "male", 4);
        System.out.printf("The blue Macaw is %d years old, is a %s, and weighs %dlbs.\n", blueMacaw.age, blueMacaw.gender, blueMacaw.weightInLbs);
        blueMacaw.eat();
        blueMacaw.sleep();
        blueMacaw.fly();
    }
}
