// Define the Car class
class Car {
    // Fields (instance variables)
    String make;
    String model;
    int year;

    // Constructor to initialize the fields
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}

// Main class to create objects and use the Car class
public class Main {
    public static void main(String[] args) {
        // Create Car objects
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Civic", 2021);

        // Display details of the cars
        car1.displayDetails();
        car2.displayDetails();
    }
}
