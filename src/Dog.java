public class Dog {

    public String name;
    public String breed;
    public final String ANIMAL_TYPE = "Canine";
    public boolean canBreed;
    public int age;

    public void callForDog(String name) {
        if(name.equalsIgnoreCase(this.name)) {
            System.out.println(this.name + " is looking at you.");
        } else {
            System.out.println(this.name + " is ignoring you.");
        }
    }


}
