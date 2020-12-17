package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication extends Student {

    static HashMap<String, Student> students = new HashMap<>();

    public GradesApplication(String name) {
        super(name);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Kristen");
        s1.addGrade(95);
        s1.addGrade(96);
        s1.addGrade(97);
        s1.addGrade(98);
        students.put("kris10", s1);

        Student s2 = new Student("Chief");
        s2.addGrade(100);
        s2.addGrade(101);
        s2.addGrade(102);
        s2.addGrade(103);
        students.put("chiefbeef", s2);

        Student s3 = new Student("Kitty");
        s3.addGrade(97);
        s3.addGrade(98);
        s3.addGrade(99);
        s3.addGrade(100);
        students.put("kittysmalls", s3);

        Student s4 = new Student("Bob");
        s4.addGrade(91);
        s4.addGrade(92);
        s4.addGrade(93);
        s4.addGrade(94);
        students.put("bobert", s4);




        boolean accessGrades = true;
        Input userInput = new Input();

        do {
            System.out.println("Here are the GitHub usernames of our students:");
            for (String username : students.keySet()) {
                System.out.printf(" |%s| ", username);
            }
            // new line for separating string from question
            System.out.println();

            String usernameChoice = userInput.getString("What student would you like to see more information on?");

            if(!students.containsKey(usernameChoice)) {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\".\n", usernameChoice);
            } else {
                System.out.println("********************");
                System.out.printf("Name: %s - GitHub Username: %s\n", students.get(usernameChoice).getName(), usernameChoice);
                System.out.printf("Current Average: %.2f\n", students.get(usernameChoice).getGradeAverage());
            }
            Input userInput1 = new Input();
            accessGrades = userInput1.yesNo("Do you want to continue?");
        } while(accessGrades);
        System.out.println("Goodbye, and have a wonderful day!");


    }

}
