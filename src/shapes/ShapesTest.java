package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape = new Square(4);;


        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        System.out.println();

        myShape = new Rectangle(5,4);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());


    }
}
