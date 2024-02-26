//A class does not take any byte of memory.
//A class is just like a real-world entity, but it is not a real-world entity. It's a blueprint where we specify the functionalities.
//A class contains mainly two things: Methods and Data Members.
//A class can also be a nested class.
//Classes follow all of the rules of OOPs such as inheritance, encapsulation, abstraction, etc.
// types of class variable in java
//Local variables − Variables defined inside methods, constructors or blocks are called local variables. The variable will be declared and initialized within the method and the variable will be destroyed when the method has completed.
//Instance variables − Instance variables are variables within a class but outside any method. These variables are initialized when the class is instantiated. Instance variables can be accessed from inside any method, constructor or blocks of that particular class
//Class variables − Class variables are variables declared within a class, outside any method, with the static keyword.
/*// Creating a Java class
class Dog {
  // Declaring and initializing the attributes
  String breed;
  int age;
  String color;

  // methods to set breed, age, and color of the dog
  public void setBreed(String breed) {
    this.breed = breed;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setColor(String color) {
    this.color = color;
  }

  // method to print all three values
  public void printDetails() {
    System.out.println("Dog detials:");
    System.out.println(this.breed);
    System.out.println(this.age);
    System.out.println(this.color);
  }
  public class Main {
  public static void main(String[] args) {
    // Creating an object of the class Dog
    Dog obj = new Dog();

    // setting the attributes
    obj.setBreed("Golden Retriever");
    obj.setAge(2);
    obj.setColor("Golden");

    // Printing values
    obj.printDetails();
  }
}
// accessing instance variable and method 
/* First create an object */
// ObjectReference = new Constructor();

/* Now call a variable as follows */
// ObjectReference.variableName;

/* Now you can call a class method as follows */
// ObjectReference.MethodName();
/*
 Output:public class Puppy {
   int puppyAge;

   public Puppy(String name) {
      // This constructor has one parameter, <i>name</i>.
      System.out.println("Name chosen is :" + name );
   }

   public void setAge( int age ) {
      puppyAge = age;
   }

   public int getAge( ) {
      System.out.println("Puppy's age is :" + puppyAge );
      return puppyAge;
   }

   public static void main(String []args) {
      /* Object creation */
    //   Puppy myPuppy = new Puppy( "tommy" );

      /* Call class method to set puppy's age */
    //   myPuppy.setAge( 2 );

      /* Call another class method to get puppy's age */
    //   myPuppy.getAge( );

      /* You can access instance variable as follows as well */
//       System.out.println("Variable Value :" + myPuppy.puppyAge );
//    }
// }

