

public class Circle {

   private double radius = 1.0;

   public Circle() {
       }

   public Circle(double radius) {
       this.radius = radius;
   }

   public double getRadius() {
       return radius;
   }

   public void setRadius(double newRadius) {
       this.radius = newRadius;
   }

   public double getArea() {
       return radius*radius*Math.PI;
   }

   public double getCircumference() {
       return 2*radius*Math.PI;
   }

   public String toString() { // toString method 
       return "Circle[radius=" + radius + "]";
   }

}