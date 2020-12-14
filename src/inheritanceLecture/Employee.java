package inheritanceLecture;

public class Employee {
    public String name;
    public int id;

    public Employee(String name){
        this.name = name;
    }

    public void doWork() {
        System.out.println("Working...");
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Employee () {

    }
}


