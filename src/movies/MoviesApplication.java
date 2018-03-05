package movies;

import java.util.Scanner;
import util.Input;
import java.util.Arrays;

public class MoviesApplication {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the sci-fi category");
        System.out.println();
        System.out.println("Enter your choice: ");
        choice = scan.nextInt();
        scan.nextLine();

        switch (choice) {
            case 0:
                break;
            case 1:
                for (int i = 0; i < MoviesArray.findAll().length; i++) {
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Animated");
                break;
            case 3:
                System.out.println("drama");
                break;
            case 4:
                System.out.println("horror");
                break;
            case 5:
                System.out.println("sci-fi");
                break;
        }




    }
}
