package inheritanceLecture;

import java.util.ArrayList;

public class Technician {


    public Technician(String name) {
        this.name = name;
    }

    public Car repair(Car theCar){
        System.out.println("Repairing the car...");
        return theCar;
    }

    public static void main(String[] args) {
        Technician Bob = new Technician("Bob");

        Car toyota = new Toyota();
        Car ford = new Ford();
        Car chevy = new Chevy();

        Bob.repair(toyota);
        toyota.drive();
        Bob.repair(ford);
        Bob.repair(chevy);

        ArrayList<Car> cars = new ArrayList<>();
    }
}
