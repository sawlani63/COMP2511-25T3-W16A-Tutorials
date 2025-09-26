package shapes;

// Square inherits from Rectangle
// Square is a subclass of Rectangle
public class Square extends Rectangle {
    private int length;

    public Square(String color) {
        // Invoke superclass constructor
        super(color);
        length = 1;
        System.out.println("Inside Square constructor with one argument");
    }

    public Square(String color, int length) {
        // Invoke current class constructor with one argument, aka the constructor above this one
        this(color);
        this.length = length;
        System.out.println("Inside Square constructor with three arguments");
    }

    public int getArea() {
        return length * length;
    }
}
