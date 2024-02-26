public class javaPolymorphism {
    /*olymorphism is the ability of an object to take on many forms. Polymorphism is an important feature of Java OOPs concept and it allows us to perform multiple operations by using the single name of any method (interface). Any Java object that can pass more than one IS-A test is considered to be polymorphic. In Java, all Java objects are polymorphic since any object will pass the IS-A test for its own type and for the class Object.

Use of Polymorphism in Java
The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.

It is important to know that the only possible way to access an object is through a reference variable. A reference variable can be of only one type. Once declared, the type of a reference variable cannot be changed.

The reference variable can be reassigned to other objects provided that it is not declared final. The type of the reference variable would determine the methods that it can invoke on the object.

A reference variable can refer to any object of its declared type or any subtype of its declared type. A reference variable can be declared as a class or interface type.
/ Java Example: Compile Time Polymorphism
public class Main {
  // method to add two integers
  public int addition(int x, int y) {
    return x + y;
  }

  // method to add three integers
  public int addition(int x, int y, int z) {
    return x + y + z;
  }

  // method to add two doubles
  public double addition(double x, double y) {
    return x + y;
  }

  // Main method
  public static void main(String[] args) {
    // Creating an object of the Main method
    Main number = new Main();

    // calling the overloaded methods
    int res1 = number.addition(444, 555);
    System.out.println("Addition of two integers: " + res1);

    int res2 = number.addition(333, 444, 555);
    System.out.println("Addition of three integers: " + res2);

    double res3 = number.addition(10.15, 20.22);
    System.out.println("Addition of two doubles: " + res3);
  }
}
// Java Example: Run Time Polymorphism
class Vehicle {
  public void displayInfo() {
    System.out.println("Some vehicles are there.");
  }
}

class Car extends Vehicle {
  // Method overriding
  @Override
  public void displayInfo() {
    System.out.println("I have a Car.");
  }
}

class Bike extends Vehicle {
  // Method overriding
  @Override
  public void displayInfo() {
    System.out.println("I have a Bike.");
  }
}

public class Main {
  public static void main(String[] args) {
    Vehicle v1 = new Car(); // Upcasting
    Vehicle v2 = new Bike(); // Upcasting

    // Calling the overridden displayInfo() method of Car class
    v1.displayInfo();

    // Calling the overridden displayInfo() method of Bike class
    v2.displayInfo();
  }
} */
}
