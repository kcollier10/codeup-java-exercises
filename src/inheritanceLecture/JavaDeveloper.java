package inheritanceLecture;

public class JavaDeveloper extends Developer {

    public JavaDeveloper() {

    }

    public JavaDeveloper(String name) {
        super(name);
    }
    // can access the name from Employee superclass because of the super keyword
    public static void main(String[] args) {
        JavaDeveloper Sophie = new JavaDeveloper("Sophie");
        System.out.println(Sophie.name);
    }


}
