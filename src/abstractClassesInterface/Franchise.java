package abstractClassesInterface;

// I am declaring this to be an abstract class
public abstract class Franchise {
    // All of the methods inside an abstract class are like a list of rules/requirements for what needs to be implemnted in any class that **extends** this abstract class

    // If we were create a class that extends a Franchise
    // i.e. McDonald's on IH-10 vs McDonald's on 1604

    // Properties (constant values)
    private final String companyName = "Mcdonalds";
    // this is always the same, no matter where we build a franchise location
    private String managerName;

    // If we have enough properties to warrant a constructor - to set those values when initializing this class - let's create that here:
    public Franchise(String managerName) {
        // we don't have to set companyName because it is already final
        this.managerName = managerName;
    }


    // Methods
    public abstract void broilStuff (String menuItem); // broilStuff("bigMac");

    public static void broilStuff(String menuItem, int randNumber) {
        System.out.println("Statically broiling some " + menuItem);
    }
    // 8am = 800, 10pm = 2200
    public abstract void businessHours(int openTime, int closeTime);

    // non-void method
    public abstract boolean iceCreamMachineWorking();

    // non-abstract method
    public void greetCustomer() {
        // have to write out the method body here because we did NOT use the abstract keyword
        System.out.println("Welcome to McDonald's! Enjoy your meal!");
    }

    public String getCompanyName() {
        return companyName; // can retrieve this from any class that extends this abstract class, even though it's declared private
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    // Static
//    double result = Math.pow(10, 2);
    // Non-static
//    Math myCoolMathTool = new Math();


}
