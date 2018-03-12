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

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

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
                Files.write(Paths.get(filename), contents);
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

    public static void copy(String originalFileName, String copyName) {
        try {
            Files.copy(Paths.get(originalFileName), Paths.get(copyName), REPLACE_EXISTING);

        } catch(Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    public static void move(String oldPath, String newPath) {
        try{
            Files.move(Paths.get(oldPath), Paths.get(newPath));
        } catch(Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Please enter a filepath: ");
//        String filepath = scan.nextLine();
//        System.out.println(slurp(filepath));

//        System.out.println("Please enter in a file name: ");
//        String entry = scan.nextLine();
//        System.out.println();
//        System.out.println("Please enter some contents: ");
//        List<String> revoList = Arrays.asList(scan.nextLine());
//        spit(entry, revoList);

//        System.out.println("Please enter in the filepath to make exciting: ");
//        String exciting = scan.nextLine();
//        makeExciting(exciting);

//        System.out.println("Please enter and old file name: ");
//        String oldName = scan.nextLine();
//        System.out.println();
//        System.out.println("Please enter in the new file name: ");
//        String newName = scan.nextLine();
//        copy(oldName, newName);

//        System.out.println("Please enter the old file path: ");
//        String oldFilePath = scan.nextLine();
//        System.out.println();
//        System.out.println("Please enter the new file path: ");
//        String newFilePath = scan.nextLine();
//        move(oldFilePath, newFilePath);
    }
}
