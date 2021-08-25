/**
 *  A Test Driver for the Circle class
 */
public class TestCircle {  // Save as "TestCircle.java"
   public static void main(String[] args) {
      // Declare an instance of Circle class called c1.
      // Construct the instance c1 by invoking the "default" constructor
      // which sets its radius and color to their default value.
      Circle c1 = new Circle();
      // Invoke public methods on instance c1, via dot operator.
      System.out.println("The circle c1 has radius of " 
         + c1.getRadius() + " and area of " + c1.getArea());
      //The circle has radius of 1.0 and area of 3.141592653589793
   
      // Declare an instance of class circle called c2.
      // Construct the instance c2 by invoking the second constructor
      // with the given radius and default color.
      Circle c2 = new Circle(2.0);
      // Invoke public methods on instance c2, via dot operator.
      System.out.println("The circle c2 has radius of " 
         + c2.getRadius() + " and area of " + c2.getArea());
      //The circle has radius of 2.0 and area of 12.566370614359172

      Circle c3 = new Circle(3.0, "blue"); // circle c3 test with 3rd constructor

      System.out.println("The circle c3 has radius of "  // new tester
      + c3.getRadius() + " an area of " + c3.getArea() + "and color of: " + c3.getColor());

      // System.out.println(c1.radius); // test (fail error: the field Circle.radius is not visible)
      //^ works however if radius set to public in Circle class otherwise needs getter

      // c1.radius=5.0; // same error as above but also still works if radius set to public
      // System.out.println(c1.getRadius()); // test value

      Circle c4 = new Circle();   // construct an instance of Circle

      c4.setRadius(5.5);          // change radius
      System.out.println("c4 radius is: " + c4.getRadius()); // Print radius via getter

      c4.setColor("green");       // Change color
      System.out.println("c4 color is: " + c4.getColor());   // Print color via getter

      Circle c5 = new Circle(5.5);
      System.out.println(c5.toString());  // toString test

      // toString testing
      Circle c6 = new Circle(6.6);
      System.out.println(c6.toString());  // explicit call
      System.out.println(c6);             // println() calls toString() implicitly, same as above
      System.out.println("Operator '+' invokes toString() too: " + c6);  // '+' invokes toString() too

   }
}