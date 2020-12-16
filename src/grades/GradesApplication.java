package grades;

import java.util.HashMap;

public class GradesApplication {

    static HashMap<String, Student> students = new HashMap<>();

    public static void main(String[] args) {

        Student s1 = new Student("Kristen");
        s1.addGrade(95);
        s1.addGrade(96);
        s1.addGrade(97);
        s1.addGrade(98);

        Student s2 = new Student("Chief");
        s2.addGrade(100);
        s2.addGrade(101);
        s2.addGrade(102);
        s2.addGrade(103);

        Student s3 = new Student("Kitty");
        s3.addGrade(97);
        s3.addGrade(98);
        s3.addGrade(99);
        s3.addGrade(100);

        Student s4 = new Student("Bob");
        s4.addGrade(91);
        s4.addGrade(92);
        s4.addGrade(93);
        s4.addGrade(94);



    }

}
