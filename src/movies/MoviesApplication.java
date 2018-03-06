package movies;

import java.util.Scanner;
import util.Input;
import java.util.ArrayList;

public class MoviesApplication {

    public static void main(String[] args) {

        Input keepGoing = new Input();

        do {

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
            System.out.println("6 - add a new movie");
            System.out.println();
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 0:
                    break;
                case 1:
                    for (int i = 0; i < MoviesArray.findAll().length; i++) {
                        System.out.println(MoviesArray.findAll()[i].getTitle() + "--" + MoviesArray.findAll()[i].getGenre());
                    }
                    System.out.println();
                    break;
                case 2:
                    for (int i = 0; i < MoviesArray.findAll().length; i++) {
                        if (MoviesArray.findAll()[i].getGenre().equalsIgnoreCase("animated")) {
                            System.out.println(MoviesArray.findAll()[i].getTitle() + "--" + MoviesArray.findAll()[i].getGenre());
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    for (int i = 0; i < MoviesArray.findAll().length; i++) {
                        if (MoviesArray.findAll()[i].getGenre().equalsIgnoreCase("drama")) {
                            System.out.println(MoviesArray.findAll()[i].getTitle() + "--" + MoviesArray.findAll()[i].getGenre());
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    for (int i = 0; i < MoviesArray.findAll().length; i++) {
                        if (MoviesArray.findAll()[i].getGenre().equalsIgnoreCase("horror")) {
                            System.out.println(MoviesArray.findAll()[i].getTitle() + "--" + MoviesArray.findAll()[i].getGenre());
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    for (int i = 0; i < MoviesArray.findAll().length; i++) {
                        if (MoviesArray.findAll()[i].getGenre().equalsIgnoreCase("scifi")) {
                            System.out.println(MoviesArray.findAll()[i].getTitle() + "--" + MoviesArray.findAll()[i].getGenre());
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Please enter a new movie in the format: title, genre");
                    System.out.println();
                    break;
            }
        } while (keepGoing.yesNo());
    }
}
