
class Calculator {

    // Method Overloading: Addition of two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method Overloading: Addition of three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Parent class
class Vehicle {

    void startEngine() {
        System.out.println("Vehicle engine is starting");
    }
}

// Child class
class Car extends Vehicle {

    // Method Overriding
    @Override
    void startEngine() {
        System.out.println("Car engine starts with a key");
    }
}

public class Main {

    public static void main(String[] args) {

        // Method Overloading
        Calculator calc = new Calculator();

        System.out.println("Addition of two numbers: " + calc.add(10, 20));
        System.out.println("Addition of three numbers: " + calc.add(10, 20, 30));

        // Method Overriding
        Vehicle vehicle = new Vehicle();
        vehicle.startEngine();

        Car car = new Car();
        car.startEngine();
    }
}
