package movies;

import util.Input;


public class MoviesApplication {

    public static void main(String[] args) {

        Input userInput = new Input();

        // generates all movies
        Movie[] movieList = MoviesArray.findAll();
//        int userChoices = userConfirmation(scanner);

        System.out.println("*****************************************");
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the sci-fi category");
        System.out.println("6 - view movies in the comedy category");
        System.out.println("7 - view movies in the musical category");
        System.out.println("*****************************************");

        // switch statement for choosing?

//        switch (userChoices) {
//            case 0:
//                System.out.println("Goodbye!");
//                System.exit(0);
//                break;
//            case 1:
//                System.out.println("Displaying all movies:");
//                System.out.println("----------------------");
//                showMovieList("all", movieList);
//                System.out.println("----------------------");
//                break;
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//            case 7:
//        }

        //NEED TO GO BACK AND FIND OVERWRITTEN FILE

    }

}
