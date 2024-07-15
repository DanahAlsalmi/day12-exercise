public class Main {
    public static void main(String[] args) {

        System.out.println("~~~ SHAPE ~~~");
        Shape shape1 = new Shape();
        System.out.println(shape1);
        Shape shape2 = new Shape("Red", false);
        System.out.println(shape2);

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("~~~ CIRCLE ~~~");
        Circle circle1=new Circle();
        System.out.println(circle1);

        Circle circle2=new Circle(2.5);
        System.out.println(circle2);

        Circle circle3=new Circle(3.5,"pink",false);
        System.out.println(circle3);

        System.out.println("Area: "+circle3.getArea());
        System.out.println("Perimeter : "+circle3.getPerimeter());

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("~~~ RECTANGLE ~~~");
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(2.0, 4.0);
        System.out.println(rectangle2);
        Rectangle rectangle3 = new Rectangle(3.0, 5.0, "yellow", false);
        System.out.println(rectangle3);
        System.out.println("Area: " + rectangle3.getArea());
        System.out.println("Perimeter: " + rectangle3.getPerimeter());
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("~~~ SQUARE ~~~");

        Square square1 = new Square();
        System.out.println(square1);
        Square square2 = new Square(4.0);
        System.out.println(square2);

        Square square3 = new Square(6.0, "purple", true);
        System.out.println(square3);
        System.out.println("Area: " + square3.getArea());
        System.out.println("Perimeter: " + square3.getPerimeter());






    }
}