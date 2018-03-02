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

    public String getString() {
        System.out.print("Please input a string: ");
        String entry = scan.next();
        return entry;
    }

    public boolean yesNo() {
        boolean value;
        System.out.print("Please enter \"y\" \\ \"yes\" or \"n\"." );
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

    public int getInt() {
        System.out.print("Please enter an integer value: ");
        int entry = scan.nextInt();
        return entry;
    }

    double getDouble(double min, double max) {
        System.out.print("Please enter a decimal between " + min + " and " + max + ".");
        double entry = scan.nextDouble();
        if (entry < min || entry > max) {
            return getDouble(min, max);
        } else {
            return entry;
        }
    }

    double getDouble() {
        System.out.print("Please enter a decimal value: ");
        double entry = scan.nextDouble();
        return entry;
    }
}


