public class Circle extends Shape {
    
    private double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.PI*radius*radius;
        return area;
    }

    public double getPerimeter() {
        double c = 2*Math.PI*radius;
        return c;
    }

    @Override
    public String toString() {
        return "Circle" + super.toString() + ",radius=" + radius +"]";
    }
}


