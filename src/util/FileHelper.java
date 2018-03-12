package util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileHelper {

    public static List<String> slurp(String filepath) {

        try {
            return Files.readAllLines(Paths.get(filepath));

        } catch (IOException e){
            System.out.println(e.getMessage());
            System.exit(1);
            return null;
        }
    }

    public static void spit(String filename, List<String> contents) {

        try {
            if (Files.notExists(Paths.get(filename))) {
                Files.write(Paths.get("src", filename), contents);
            }
            else {
                System.out.println("File already exists");
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void makeExciting(String filename) {

        ArrayList<String> newFile = new ArrayList<>();

        try {
            List<String> oldFile = Files.readAllLines(Paths.get(filename));

            for (String item : oldFile) {
                newFile.add(item.toUpperCase() + "!");
            }

            Files.write(Paths.get(filename), newFile);
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter in a file name: ");
        String entry = scan.next();
        makeExciting(entry);

//        System.out.println("Please enter some contents: ");
//        List<String> revoList = Arrays.asList(scan.nextLine());
//        spit(entry, revoList);
    }

}
