public class JavaInheritance {
    /*In Java programming, the inheritance is an important of concept of Java OOPs. 
    Inheritance is a process where one class acquires the properties (methods and attributes) of another. 
    With the use of inheritance, the information is made manageable in a hierarchical order
The class which inherits the properties of other is known as subclass (derived class, child class) and the
 class whose properties are inherited is known as superclass (base class, parent class).
 Need of Java Inheritance
Code Reusability: The basic need of an inheritance is to reuse the features. If you have defined some functionality once, by using the inheritance you can easily use them in other classes and packages.
Extensibility: The inheritance helps to extend the functionalities of a class. If you have a base class with some functionalities, you can extend them by using the inheritance in the derived class.
Implantation of Method Overriding: Inheritance is required to achieve one of the concepts of Polymorphism which is Method overriding.
Achieving Abstraction: Another concept of OOPs that is abstraction also needs inheritance.
Implementation of Java Inheritance
To implement (use) inheritance in Java, the extends keyword is used. It inherits the properties (attributes or/and methods) of the base class to the derived class. The word "extends" means to extend functionalities i.e., the extensibility of the features.

Syntax to implement inheritance
Consider the below syntax to implement (use) inheritance in Java:

class Super {
   .....
   .....
}
class Sub extends Super {
   .....
   .....
}
class Calculation {
   int z;
	
   public void addition(int x, int y) {
      z = x + y;
      System.out.println("The sum of the given numbers:"+z);
   }
	
   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference between the given numbers:"+z);
   }
}

public class My_Calculation extends Calculation {
   public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("The product of the given numbers:"+z);
   }
	
   public static void main(String args[]) {
      int a = 20, b = 10;
      My_Calculation demo = new My_Calculation();
      demo.addition(a, b);
      demo.Subtraction(a, b);
      demo.multiplication(a, b);
   }
}


 */
}
