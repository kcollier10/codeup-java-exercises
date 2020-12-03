import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner myScanner;
        myScanner = new Scanner(System.in);


//        double pi = 3.14159;
//        System.out.format("%.2f%n", pi);
//
//
//        int number;
//
//        System.out.println("Please type a number below.");
//        number = myScanner.nextInt();
//        System.out.printf("You entered: %d.%n", number);
//        // if character/string is typed, error is thrown
//
//        System.out.println("Please enter your first, second, and third favorite colors.");
//        String firstColor = myScanner.next();
//        String secondColor = myScanner.next();
//        String thirdColor = myScanner.next();
//
//        System.out.println(firstColor);
//        System.out.println(secondColor);
//        System.out.println(thirdColor);
//
//        System.out.printf("Thank you for your cooperation! Here are your top three colors: %s, %s, %s.%n", firstColor, secondColor, thirdColor);
//
//        System.out.println("Please enter a sentence: ");
//        String sentence;
//        sentence = myScanner.next();
//        // using .next() only prints first word of string (prints to first whitespace)
//        System.out.printf("You entered: %s%n", sentence);
//
//        String sentence2;
//        sentence2 = myScanner.nextLine();
//        System.out.printf("You entered: %s%n", sentence2);
//
//        System.out.println("We're going to calculate the perimeter of a Codeup Classroom.");
//        System.out.println("Below this line, please submit two values: the first for width of the room, and the second for height of the room.");
//        int width = myScanner.nextInt();
//        int height = myScanner.nextInt();
//        int perimeter = (2 * width) + (2 * height);
//
//        System.out.printf("You entered %d.2f and %d.2f.", width, height);
//        System.out.printf("The perimeter of the room is: %d.2f", perimeter);
        myScanner.useDelimiter("/n");
        System.out.println("We're going to calculate the perimeter of a Codeup Classroom.");
        System.out.println("Below this line, please submit two values: the first for width of the room, and the second for height of the room.");
        String width = myScanner.nextLine();
        String height = myScanner.nextLine();
        int widthInteger = Integer.parseInt(width);
        int heightInteger = Integer.parseInt(height);

        int perimeter = (2 * widthInteger) + (2 * heightInteger);

        System.out.printf("You entered %.2f and %.2f.", widthInteger, heightInteger);
        System.out.printf("The perimeter of the room is: %d", perimeter);




    }
}
