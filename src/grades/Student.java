package grades;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        System.out.println("Student's grade average is: ");
        double sum = 0;
        if(!grades.isEmpty()) {
            for (Integer grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        }
        return sum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public static void main(String[] args) {

        // ArrayList<String> s1 = new ArrayList<>();
        // doesn't work

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



//        System.out.println(s1.getGradeAverage());
    }
}
