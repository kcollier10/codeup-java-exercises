import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));
        // Returns a string representation of the contents of the specified array. The string representation consists of a list of the array’s elements, enclosed in square brackets (“[]”). Adjacent elements are separated by the characters “, ” (a comma followed by a space). Returns “null” if a is null.
        //In case of an Object Array, if the array contains other arrays as elements, they are converted to strings by the Object.toString() method inherited from Object, which describes their identities rather than their contents.

        String[] Beatles = {"John", "Paul", "Ringo"};

//        for (String person : Beatles) {
//            System.out.println(person);
//        }
        addPerson(Beatles, "Kristen");


    }

    private static void addPerson() {
    }

    public static void addPerson(String[] Beatles, String addMember){
//        System.out.println("Please enter your name to add it to the Beatles line-up:");
//        Scanner sc = new Scanner(System.in);
//        addMember = sc.next();
        String[] newBeatles = Arrays.copyOf(Beatles, 4);
        newBeatles[3] = addMember;

        for (String person : newBeatles) {
            System.out.println(person);
        }
    }
}
//        int i = Beatles.length;
//        int n = ++i;
//        String[] newBeatles = new String[n];
//        for(int count = 0; count < Beatles.length; count++){
//            newBeatles[count] = Beatles[count];
//        }
//        return newBeatles;
