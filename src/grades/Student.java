package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        int total = 0;
        for (int i = 0; i < grades.size(); i++) {
           total += grades.get(i);
        }
        return total / grades.size();
    }

}
