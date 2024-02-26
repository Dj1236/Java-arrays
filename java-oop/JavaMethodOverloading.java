public class JavaMethodOverloading {
    /*Java Methods Overloading
When a class has two or more methods by the same name but different parameters, it is known as method overloading. It is different from overriding. In overriding, a method has the same method name, type, number of parameters, etc.

Let's consider the example discussed earlier for finding minimum numbers of integer type. If, let's say we want to find the minimum number of double type. Then the concept of overloading will be introduced to create two or more methods with the same name but different parameters.

The following example explains the same −

Example: Methods Overloading in Java
public class ExampleOverloading {

   public static void main(String[] args) {
      int a = 11;
      int b = 6;
      double c = 7.3;
      double d = 9.4;
      int result1 = minFunction(a, b);
      
      // same function name with different parameters
      double result2 = minFunction(c, d);
      System.out.println("Minimum Value = " + result1);
      System.out.println("Minimum Value = " + result2);
   }

   // for integer
   public static int minFunction(int n1, int n2) {
      int min;
      if (n1 > n2)
         min = n2;
      else
         min = n1;

      return min; 
   }
   
   // for double
   public static double minFunction(double n1, double n2) {
     double min;
      if (n1 > n2)
         min = n2;
      else
         min = n1;

      return min; 
   }
}
 */
/*The this Keyword inside Java Methods
this is a keyword in Java which is used as a reference to the object of the current class, with in an instance method or a constructor.
Using this you can refer the members of a class such as constructors, variables and methods.

Note − The keyword this is used only within instance methods or constructors

This
In general, the keyword this is used to −

Differentiate the instance variables from local variables if they have same names, within a constructor or a method.

class Student {
   int age;   
   Student(int age) {
      this.age = age;	
   }
}
Call one type of constructor (parametrized constructor or default) from other in a class. It is known as explicit constructor invocation.

class Student {
   int age
   Student() {
      this(20);
   }
   
   Student(int age) {
      this.age = age;	
   }
}
Example: Use of this keyword in Java Methods
Here is an example that uses this keyword to access the members of a class. Copy and paste the following program in a file with the name, This_Example.java.

public class This_Example {
   // Instance variable num
   int num = 10;
	
   This_Example() {
      System.out.println("This is an example program on keyword this");	
   }

   This_Example(int num) {
      // Invoking the default constructor
      this();
      
      // Assigning the local variable <i>num</i> to the instance variable <i>num</i>
      this.num = num;	   
   }
   
   public void greet() {
      System.out.println("Hi Welcome to Tutorialspoint");
   }
      
   public void print() {
      // Local variable num
      int num = 20;
      
      // Printing the local variable
      System.out.println("value of local variable num is : "+num);
      
      // Printing the instance variable
      System.out.println("value of instance variable num is : "+this.num);
      
      // Invoking the greet method of a class
      this.greet();     
   }
   
   public static void main(String[] args) {
      // Instantiating the class
      This_Example obj1 = new This_Example();
      
      // Invoking the print method
      obj1.print();
	  
      // Passing a new value to the num variable through parametrized constructor
      This_Example obj2 = new This_Example(30);
      
      // Invoking the print method again
      obj2.print(); 
   }
}
 */
}
