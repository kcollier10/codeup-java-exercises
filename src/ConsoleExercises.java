import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner myScanner;
        myScanner = new Scanner(System.in);


        double pi = 3.14159;
        System.out.format("%.2f%n", pi);


        int number;
        System.out.println("Please type a number below.");
        number = myScanner.nextInt();
        System.out.printf("You entered: %d.%n", number);

        System.out.println("Please enter your first, second, and third favorite colors.");
        String firstColor = myScanner.next();
        String secondColor = myScanner.next();
        String thirdColor = myScanner.next();

        System.out.println(firstColor);
        System.out.println(secondColor);
        System.out.println(thirdColor);

        System.out.printf("Thank you for your cooperation! Here are your top three colors: %s, %s, %s.%n", firstColor, secondColor, thirdColor);

        System.out.println("Please enter a sentence: ");
        String sentence;
        sentence = myScanner.next();
        // using .next() only prints first word of string (prints to first whitespace)
        System.out.printf("You entered: %s%n", sentence);

        String sentence2;
        sentence2 = myScanner.nextLine();
        System.out.printf("You entered: %s%n", sentence2);

        System.out.println("We're going to calculate the perimeter of a Codeup Classroom.");
        System.out.println("Below this line, please submit two values: the first for width of the room, and the second for height of the room.");
        int W = myScanner.nextInt();
        int H = myScanner.nextInt();
        int perimeter = (2 * W) + (2 * H);

        System.out.printf("You entered %d.2f and %d.2f.", W, H);
        System.out.printf("The perimeter of the room is: %d.2f", perimeter);

        myScanner.useDelimiter("/n");
        System.out.println("We're going to calculate the perimeter of a Codeup Classroom.");
        System.out.println("Below this line, please submit two values: the first for width of the room, and the second for height of the room.");
        String width = myScanner.nextLine();
        String height = myScanner.nextLine();
        float widthL = Float.parseFloat(width);
        float heightL = Float.parseFloat(height);

        float area = (2 * widthL) + (2 * heightL);
        float volume = (widthL * heightL);

        System.out.printf("You entered %.2f and %.2f.", widthL, heightL);
        System.out.printf("The perimeter of the room is: %.2f. The volume of the room is %.2f", area, volume);

        int length2 = parseInt(myScanner.nextLine());
        int width2 = parseInt(myScanner.nextLine());

        int area2 = length2 * width2;
        int perimeter2 = (length2 * 2) + (width2 * 2);

        System.out.printf("The perimeter of the room is: %.2d. The volume of the room is %.2d", perimeter2, area2);



    }

}
