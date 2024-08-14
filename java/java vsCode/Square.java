public class Square implements Shape {
    private double side;

    // Constructor to initialize the side length
    public Square(double side) {
        this.side = side;
    }

    // Implementing the calculateArea method for Square
    @Override
    public double calculateArea() {
        return side * side;
    }

    // Implementing the calculatePerimeter method for Square
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    // Method to display the square's details
    public void displayDetails() {
        System.out.println("Square Details:");
        System.out.println("Side: " + side);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    // Main method to test the Square class
    public static void main(String[] args) {
        Square square = new Square(4.0);
        square.displayDetails();
    }
}
