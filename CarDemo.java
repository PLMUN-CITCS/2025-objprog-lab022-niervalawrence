class Car {
    // Attributes of the Car class
    String make;
    String model;
    int year;

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // Create a new Car object
        Car myCar = new Car();
        
        // Set values for the attributes
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;
        
        // Display car information using the displayInfo method
        myCar.displayInfo();
    }
}
