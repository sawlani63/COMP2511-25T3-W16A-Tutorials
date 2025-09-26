package shapes;

// Shape is an abstract class so any abstract methods defined here must be implemented by its subclasses
public abstract class Shape {
    private String colour;

    // Static field therefore it acts as a global variable and its value is shared between every instance of this class
    private static int count = 0;

    // Important point: Just because abstract classes cannot be instantiated i.e. you cant do new Shape(), that does not mean they
    // dont have constructors.... these constructors are invoked when an instance of a subclass is created
    public Shape(String colour) {
        System.out.println("Inside Shape constructor");
        this.colour = colour;
        count++;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public static int getCount() {
        return count;
    }

    public abstract int getArea();

}
