public class javaMethods {
/*A Java method is a collection of statements that are grouped together to perform an operation.
    When you call the System.out.println() method, for example, the system actually executes several
     statements in order to display a message on the console */ 

/*Creating a Java Method
To create a Java method, there should be an access modifier followed by the return type, method's name, and parameters list.

Syntax to Create a Java Method
Considering the following example to explain the syntax of a method −

modifier returnType nameOfMethod (Parameter List) {
   // method body
}
 */
/* Example: Defining and Calling a Java Method
Following is the example to demonstrate how to define a method and how to call it −

public class ExampleMinNumber {
   
   public static void main(String[] args) {
      int a = 11;
      int b = 6;
      int c = minFunction(a, b);
      System.out.println("Minimum Value = " + c);
   }

   /* returns the minimum of two numbers 
   public static int minFunction(int n1, int n2) {
      int min;
      if (n1 > n2)
         min = n2;
      else
         min = n1;

      return min; 
   }
}
  */

/*Passing Parameters by Value in Java Methods
While working under calling process, arguments is to be passed. These should be in the same order as their respective parameters in the method specification. Parameters can be passed by value or by reference.

Passing Parameters by Value means calling a method with a parameter. Through this, the argument value is passed to the parameter.

Example: Passing Parameters by Value
The following program shows an example of passing parameter by value. The values of the arguments remains the same even after the method invocation.

public class swappingExample {

   public static void main(String[] args) {
      int a = 30;
      int b = 45;
      System.out.println("Before swapping, a = " + a + " and b = " + b);

      // Invoke the swap method
      swapFunction(a, b);
      System.out.println("\n**Now, Before and After swapping values will be same here**:");
      System.out.println("After swapping, a = " + a + " and b is " + b);
   }

   public static void swapFunction(int a, int b) {
      System.out.println("Before swapping(Inside), a = " + a + " b = " + b);
      
      // Swap n1 with n2
      int c = a;
      a = b;
      b = c;
      System.out.println("After swapping(Inside), a = " + a + " b = " + b);
   }
}
 */
}
