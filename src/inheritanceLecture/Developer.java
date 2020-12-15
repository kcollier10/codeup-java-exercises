package inheritanceLecture;

public class Developer extends Employee {

//    public Developer (String name) {
//        super(name);
//    }

    public Developer () {

    }
    public Developer(String name) {
        super(name);
    }

    public void doWork() {
        System.out.println("Writing code...");
    }

    public void debug () {
        System.out.println("DEBUGGING");
    }


    public static void main(String[] args) {
        Employee Bob = new Employee("Bob");
        Bob.doWork();
        System.out.println(Bob.getName());
        // cannot do Bob.debug() because parent class does not have access to child class

        Developer John = new Developer("John");
        John.doWork();
        System.out.println(John.getName());
        John.debug();
    }
}
