package shapes;

import java.util.Scanner;

//import util.Input;

public class CircleApp {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the radius of your circle: ");
        double entry = scan.nextDouble();

        Circle newCircle = new Circle(entry);

        System.out.println(newCircle.getArea());
        System.out.println(newCircle.getCircumference());

    }
}
