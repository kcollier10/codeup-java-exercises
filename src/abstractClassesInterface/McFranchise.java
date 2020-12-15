package abstractClassesInterface;

// Declaring this as an 'interface'
public interface McFranchise {
    // Properties
    String companyName = "McDonald's"; // this String is a constant

    // in interface, the public static final is assumed
    // can't have a constructor in an interface (only in abstract classes)
    // Abstract Methods (that we have to completely write out in any class that IMPLEMENTS this interface)
    public void broilStuff(String menuItem);
    public void businessHours(int openTime, int closeTime);
    public String iceCreamMachineWorking();
}
