public class javaVariableScope {
//The variable's scope refers to the region where they are created and accessed in a given program or function. The variable scope also refers to its lifetime.


/*Scope of Java Instance Variables
A variable which is declared inside a class and outside all the methods and blocks is an instance variable. The general scope of an instance variable is throughout the class except in static methods. The lifetime of an instance variable is until the object stays in memory.
Example: Scope of Java Instance Variables
In the example below, we define an instance variable puppyAge in Puppy class and using its setAge(), we're modifying it and using getAge() method, we're getting it. This variable is available till the lifetime of myPuppy object instance.

public class Puppy {
   private int puppyAge;
   
   public void setAge( int age ) {
      // access the instance variable and modify it	   
      puppyAge = age;
   }

   public int getAge( ) {
	  // access the instance variable  
      return puppyAge;
   }

   public static void main(String []args) {    
      Puppy myPuppy = new Puppy();
      myPuppy.setAge( 2 );
      System.out.println("Puppy Age :" + myPuppy.getAge() );
   }
}
C */

/*Scope of Java Instance Variables
A variable which is declared inside a class and outside all the methods and blocks is an instance variable. The general scope of an instance variable is throughout the class except in static methods. The lifetime of an instance variable is until the object stays in memory.

Example: Scope of Java Instance Variables
In the example below, we define an instance variable puppyAge in Puppy class and using its setAge(), we're modifying it and using getAge() method, we're getting it. This variable is available till the lifetime of myPuppy object instance.



public class Puppy {
   private int puppyAge;
   
   public void setAge( int age ) {
      // access the instance variable and modify it	   
      puppyAge = age;
   }

   public int getAge( ) {
	  // access the instance variable  
      return puppyAge;
   }

   public static void main(String []args) {    
      Puppy myPuppy = new Puppy();
      myPuppy.setAge( 2 );
      System.out.println("Puppy Age :" + myPuppy.getAge() );
   }
}
 */

    
}
