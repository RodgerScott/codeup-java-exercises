package util;

import java.util.Scanner;

public class Input {

    private Scanner scan;

    public Input() {
        this.scan = new Scanner(System.in);
    }

    public Scanner getScan() {
        return scan;
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return scan.next();

    }

    public boolean yesNo(String prompt) {
        boolean value;
        System.out.print(prompt);
        String entry = scan.next();
        if (entry.equalsIgnoreCase("y") || entry.equalsIgnoreCase("yes")) {
            value = true;
        } else {
            value = false;
        }
        return value;
    }

    public int getInt(int min, int max) {
        System.out.print("Please enter a value between " + min + " and " + max + ".");
        int entry = scan.nextInt();
        if (entry < min || entry > max) {
            return getInt(min, max);
        } else {
            return entry;
        }
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        String entry = scan.next();
        try {
            return Integer.valueOf(entry);
        } catch (NumberFormatException e) {
            System.out.println("Bro, I was asking for an integer. Try again.");
            return getInt(prompt);
        }
    }

    public double getDouble(double min, double max) {
        System.out.print("Please enter a decimal between " + min + " and " + max + ".");
        double entry = scan.nextDouble();
        if (entry < min || entry > max) {
            return getDouble(min, max);
        } else {
            return entry;
        }
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        String entry = scan.next();
        try {
            return Double.valueOf(entry);
        } catch(NumberFormatException e) {
            System.out.println("Bro, please read the prompt and try again.");
            return getDouble(prompt);
        }
    }

//    public int getBinary() {
//        System.out.println("Please enter a binary number: ");
//        String entry = scan.next();
//    }

    public int getHex(String prompt) {
        System.out.print(prompt);
        String entry = scan.next();
        try {
           return Integer.valueOf(entry);
        } catch(NumberFormatException e) {
            System.out.println("Bro, please read the prompt and try again.");
            return getHex(prompt);
        }
    }
}


