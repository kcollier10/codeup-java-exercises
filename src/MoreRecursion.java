public class MoreRecursion {

    /**
     * Any problem solved with iteration can be solved using recursion.
     */

    /*
        EXAMPLE 1

        Define a method that prints out hello 10 times.

     */

    // solution using a loop
    public static void printHello10TimesIteration() {
        for (int i = 1; i <= 10; i += 1) {
            System.out.println("Hello");
        }
    }

    // solution using recursion
    public static void printHello10TimesRecursion(int i) {
        if (i == 10) return; // base case/stop condition
        System.out.println("Hello");
        printHello10TimesRecursion(i + 1);
    }

    /*
        PROBLEM 1

        Define a method that prints out numbers from 1 up to the passed input.

     */

    // using a loop
    public static void printNumbersFrom1UpToInputIteration(int input) {
        for (int i = 1; i <= input; i += 1) {
            System.out.println(i);
        }
    }

    // using recursion
    // TODO: use the solution above to write the method below using recursion
    public static void printNumbersFrom1UpToInputRecursion(int input, int start) {
        if (input == start) {
            return;
        }
        printNumbersFrom1UpToInputRecursion(input, start + 1);
    }

    /**
     * Any problem solved with recursion can be solved with iteration.
     */


    /*
        EXAMPLE 2

        Create a method that will add numbers from 1 up to the passed in input.

     */

    // using recursion
    public static int addNumbersFrom1ToInputRecursion(int input, int total) {
        if (input == 1) return total;
        return addNumbersFrom1ToInputRecursion(input - 1, total + input);
    }

    // using iteration
    public static int addNumbersFrom1ToInputIteration(int input) {
        int total = 0;
        for (int i = 1; i <= input; i += 1) {
            total += i;
        }
        return total;
    }

    /*
        PROBlEM 2

        Create a method that will return the highest number up to a given limit achieved by doubling a given number.

     */

    // using recursion
    public static int doubleNumberUpToRecursion(int limit, int start) {
        if (start * 2 > limit) {
            return start;
        } else {
            return doubleNumberUpToRecursion(limit, start * 2);
        }
    }

    // using iteration
    // TODO: use the solution above to write the method below using iteration
    public static int doubleNumberUpToLimitIteration(int limit, int start) {
        while (start * 2 <= limit) {
            start *= 2;
        }
        return start;
    }

    // use this main method to test out your code
    public static void main(String[] args) {

        doubleNumberUpToLimitIteration(20, 2);

    }









    // POSSIBLE SOLUTIONS BELOW THIS LINE!!! Avoid looking at a possible solution until you've created your own solution.



























    // Possible Solution for Problem 1

//    public static void printNumbersFrom1UpToInputRecursion(int input, int start) {
//        System.out.println(start);
//        if (input == start) {
//            return;
//        }
//        printNumbersFrom1UpToInputRecursion(input, start + 1);
//    }


    // Possible Solution for Problem 2
//    public static int doubleNumberUpToLimitIteration(int limit, int start) {
//        while (start * 2 <= limit) {
//            start *= 2;
//        }
//        return start;
//    }

}