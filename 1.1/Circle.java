/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius = 1.0;
   private String color = "red";
   
   // Constructors (overloaded)
   /** Constructs a Circle instance with default value for radius and color */
   public Circle() {  // 1st (default) constructor
      //this.radius = 1.0; // commented to test out default field values and attributeless consttcutor
     // this.color = "red";
   }
   
   /** Constructs a Circle instance with the given radius and default color */
   public Circle(double radius) {  // 2nd constructor
      this.radius = radius;
      this.color = "red";
   }

   public Circle(double radius, String color) { // 3rd constructor 
      this.radius = radius;
      this.color = color;
   }
   
   /** Returns the radius */
   public double getRadius() {
     return radius; 
   }
   
   /** Returns the area of this Circle instance */
   public double getArea() {
      return radius*radius*Math.PI;
   }

   public String getColor() {
      return color;
   }

   public void setRadius(double newRadius) { //setter for new radius
      this.radius = newRadius;
   }

   public void setColor(String newColor) { //setter for new color
      this.color = newColor;
   }

   public String toString() { // toString method 
      return "Circle[radius=" + radius + " color=" + color + "]";
   }

}