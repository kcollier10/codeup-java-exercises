import java.util.Scanner;

public class Bob {

    public static void main (String[] args) {

    Scanner myScanner = new Scanner(System.in);


//        System.out.println("*************************");
//        System.out.println("Welcome to Bob Simulator!");
//        System.out.println("*************************");
//        System.out.println("Start typing to speak with Bob!");
//
//        String userInput;
//        userInput = myScanner.nextLine();
//
//        while (!userInput.equalsIgnoreCase("exit")) {
//            if (userInput.equals("")) {
//                System.out.println("Fine. Be that way!");
//            } else if (userInput.endsWith("!")) {
//                System.out.println("Whoa, chill out!");
//            } else if (userInput.endsWith("?")) {
//                System.out.println("Sure.");
//            } else {
//                System.out.println("Whatever.");
//            }
//            userInput = myScanner.nextLine();
//        }

        System.out.println("Please enter date in MM/DD/YYYY");
        String Date = myScanner.nextLine();
        String Month = Date.substring(0,2);
        String Day = Date.substring(3,5);
        String Year = Date.substring(6);

        System.out.println(Month);
        System.out.println(Day);
        System.out.println(Year);

        switch (Month) {
            case "01":
                Month = "January";
                System.out.printf("%s %s, %s", Month, Day, Year);
                break;
            case "02":
                Month = "February";
                System.out.printf("%s %s, %s", Month, Day, Year);
                break;
            case "03":
                Month = "March";
                System.out.printf("%s %s, %s", Month, Day, Year);
                break;
            case "04":
                Month = "April";
                System.out.printf("%s %s, %s", Month, Day, Year);
                break;
            case "05":
                Month = "May";
                System.out.printf("%s %s, %s", Month, Day, Year);
                break;
            case "06":
                Month = "June";
                System.out.printf("%s %s, %s", Month, Day, Year);
                break;
            case "07":
                Month = "July";
                System.out.printf("%s %s, %s", Month, Day, Year);
                break;
            case "08":
                Month = "August";
                System.out.printf("%s %s, %s", Month, Day, Year);
                break;
            case "09":
                Month = "September";
                System.out.printf("%s %s, %s", Month, Day, Year);
                break;
            case "10":
                Month = "October";
                System.out.printf("%s %s, %s", Month, Day, Year);
                break;
            case "11":
                Month = "November";
                System.out.printf("%s %s, %s", Month, Day, Year);
                break;
            case "12":
                Month = "December";
                System.out.printf("%s %s, %s", Month, Day, Year);
                break;

        }


    }

}
