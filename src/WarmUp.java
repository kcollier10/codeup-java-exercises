import java.util.Scanner;
public class WarmUp {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to 'PRINT THE VEGETABLE COUNT' app!\n");
        System.out.print("How many vegetables do you have? ");
        int count = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("What kind of vegetable? (use a singular noun, e.g. 'carrot' vs. 'carrots'): ");
        String veggie = myScanner.next();
        System.out.printf("You have %d %ss!\n\n", count, veggie);
    }
}

// change the original .nextLine()
