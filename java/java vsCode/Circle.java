public class Circle implements Shape {
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the calculateArea method for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementing the calculatePerimeter method for Circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to display the circle's details
    public void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.displayDetails();
    }
}
