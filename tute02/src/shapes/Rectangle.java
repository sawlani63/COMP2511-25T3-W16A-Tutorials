package shapes;

// Rectangle inherits from Shape
public class Rectangle extends Shape {
    public int height;
    public int width;

    public Rectangle(String color) {
        super(color);
        this.width = 1;
        this.height = 1;
        System.out.println("Inside Rectangle constructor with one argument");
    }

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        System.out.println("Inside Rectangle constructor with three arguments");
    }

    public int getArea() {
        return height * width;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("red", 10, 20);

        /*
         * This works because Square is a subclass of Rectangle.
         * Rectangle r2 can only call methods defined in the Rectangle class.
         * However, since it points to a Square object in memory, any function that is defined
         * in both Rectangle AND the Square class, uses the implementation in the Square class for that method.
         */
        Rectangle r2 = new Square("blue", 20);

        System.out.println(r2.getArea());

        /*
         * The correct way to invoke static methods since they belong to a class rather than an instance (object) of a class. 
         */
        System.out.println(Shape.getCount());
    }
}
