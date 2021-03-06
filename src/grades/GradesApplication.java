package grades;

import javafx.scene.control.TextInputDialog;

import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;
import util.Input;

import javax.naming.Name;

public class GradesApplication {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Input keepGoing = new Input();

        Student ted = new Student("Ted");
        ted.addGrade(95);
        ted.addGrade(81);
        ted.addGrade(92);

        Student greg = new Student("Greg");
        greg.addGrade(92);
        greg.addGrade(68);
        greg.addGrade(100);

        Student fred = new Student("Fred");
        fred.addGrade(56);
        fred.addGrade(76);
        fred.addGrade(45);

        Student gail = new Student("Gail");
        gail.addGrade(99);
        gail.addGrade(93);
        gail.addGrade(97);

        HashMap<String, Student> githubUsernames = new HashMap<>();

        githubUsernames.put("TedtheCodeDestroyer", ted);
        githubUsernames.put("OOPsIDidItAgain", greg);
        githubUsernames.put("Flinstonio", fred);
        githubUsernames.put("GaildaCodeSnail", gail);


            System.out.println("Welcome to Our Student Info App");
            System.out.println();
            System.out.println("Here are the Github usernames of our students:");
            System.out.println();
            System.out.println(githubUsernames.keySet());


        do {
            System.out.println();
            System.out.println("Which student would you like to learn more about?");
            String entry = scan.next();

            if (githubUsernames.containsKey(entry)) {
                System.out.println("Name: " + githubUsernames.get(entry).getName());
                System.out.println("Github user: " + entry);
                System.out.println("Grade Average: " + githubUsernames.get(entry).getGradeAverage());
                System.out.println("All Grades: " + githubUsernames.get(entry).getGrades());
            } else {
                System.out.println("I'm sorry, this person does not exist.");
            }
            System.out.println();
            System.out.println("Would you like to see all Students Grades? y/n");
            String seeIt = scan.next();

            if (seeIt.equalsIgnoreCase("y")) {
                for (Student totesUsers : githubUsernames.values()) {
                    System.out.println(totesUsers.getName() + " " + totesUsers.getGrades());
                }
            }
            System.out.println();
            System.out.println("Would you like to see the average grade for all students?");
            String totalAvg = scan.next();

            if (totalAvg.equalsIgnoreCase("y")) {
                double totesMcgoats = 0;
                for (Student totesUsers : githubUsernames.values()) {
                    totesMcgoats += totesUsers.getGradeAverage();
                }
                System.out.println(totesMcgoats / githubUsernames.size());
            }

        } while(keepGoing.yesNo("Would you like to look for another student?"));


//        System.out.println(ted.getName());
//        System.out.println(ted.getGradeAverage());
//        System.out.println();
//        System.out.println(greg.getName());
//        System.out.println(greg.getGradeAverage());
    }
}
