import java.util.Scanner;
public class ControlFlowExercises {
    public static void main (String[] arg) {
        Scanner myScanner = new Scanner(System.in);

//        int i = 5;
//
//        while (i <= 15) {
//            System.out.printf("%d ", i);
//            i++;
//        }
//
//        System.out.println("-----------------");

//        int i = 0;
//
//        do {
//            i+= 2;
//            System.out.println(i);
//        }
//        while (i <= 100);

//        int i = 100;
//        do {
//            i -= 5;
//            System.out.println(i);
//        }
//        while (i > -10);

//        long i = 2;
//        do {
//            i = i * i;
//            System.out.println(i);
//        }
//        while (i <= 65537L);

//        for(int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 2; i <= 100; i++) {
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for(long i = 2; i <= 65536; i *= i){
//            System.out.println(i);
//        }
//
//        for(int i = 0; i <= 100; i++) {
//            if(i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }
        boolean userContinues = true;

        do {

            System.out.println("Please enter your max number:");
            int number = myScanner.nextInt();
            System.out.printf("You entered: %d.", number);
            System.out.println();
            System.out.printf("Here is your table, up to number: %d", number);
            System.out.println();
            System.out.println(" number |  squared  | cubed ");
            System.out.println(" ------ |  -------  | ----- ");


            for (int i = 1; i <= number; i++) {
                i = number;
                int numberSquared = (int) Math.pow(i, 2);
                int numberCubed = (int) Math.pow(i, 3);

                System.out.printf("%-7d", i);
                System.out.print("|");
                System.out.printf("%-8d", numberSquared);
                System.out.print("|");
                System.out.printf("%-9d", numberCubed);
                System.out.println();
            }

            System.out.print("Would you like to enter another number? Y or N");
            String userResponse = myScanner.next();
            if(!userResponse.equalsIgnoreCase("y")) {
                userContinues = false;
            }
        } while (userContinues);


//       do {
           System.out.println("Enter an integer (whole number without digits):");
           int grade = myScanner.nextInt();
           if (grade <= 59) {
               System.out.println("Current grade is a : F");
           } else if (grade <= 66) {
               if (66 - grade <= 2) {
                   System.out.println("Current grade is a : D+");
               } else if (66 - grade >= 6) {
                   System.out.println("Current grade is a : D-");
               } else
                   System.out.println("Current grade is a : D");
           } else if (grade <= 79) {
               if (79 - grade <= 3) {
                   System.out.println("Current grade is a : C+");
               } else if (79 - grade >= 9) {
                   System.out.println("Current grade is a : C-");
               } else
                   System.out.println("Current grade is a : C");
           } else if (grade <= 87) {
               if (87 - grade <= 3) {
                   System.out.println("Current grade is a : B+");
               } else if (87 - grade >= 6) {
                   System.out.println("Current grade is a : B-");
               } else
                   System.out.println("Current grade is a : B");
           } else if (grade <= 100) {
               if (100 - grade <= 5) {
                   System.out.println("Current grade is a : A+");
               } else if (100 - grade >= 10) {
                   System.out.println("Current grade is a : A-");
               } else
                   System.out.println("Current grade is a : A");
           }


//        System.out.print("Continue? (y/n): ");
//        userChoice = myScanner.next();
//        System.out.println();
//    } while (!userChoice.equalsIgnoreCase("n"));
//
    }


}
