public class PersonTest {

    public static void main (String[] args) {

        Person p1 = new Person("Kristen");

        p1.sayHello();
        p1.setName("K10");




//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        true, values are equal
//        System.out.println(person1 == person2);
//        false, they have different IDs

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
        // reassigning a reference to something else, so the container is still the same
        // would always return true because it always equals itself

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
        // becomes Jane for both names because they're still pointing to the same thing

    }
}
