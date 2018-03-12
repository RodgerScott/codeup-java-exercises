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
            Path dataDirectory = Paths.get(filepath);
            List<String> data = Files.readAllLines(dataDirectory);
            return data;

        } catch (IOException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void spit(String filename, List<String> contents) {

        try {
            Files.write(Paths.get("src", filename), contents);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void makeExciting(String filename) {


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter in a file name: ");
        String entry = scan.nextLine();
        System.out.println();

        System.out.println("Please enter some contents: ");
        List<String> revoList = Arrays.asList(scan.nextLine());
        spit(entry, revoList);
    }


}
