public class TestMyCircle {
    public static void main(String[] args) {

//constructor 2
MyCircle c1 = new MyCircle(4, 3, 2);
//constructor 3
MyPoint p1 = new MyPoint(6,5);
MyCircle c2 = new MyCircle(p1, 3);

//getradius
System.out.println("radius=" + c1.getRadius());
//setradius
c1.setRadius(20);

//getcenter
System.out.println("center=" + c1.getCenter());
//setcenter
c1.setCenter(p1);

//getcenterx
System.out.println("centerx=" + c1.getCenterX());
//setcenterx
c1.setCenterX(40);

//getcentery
System.out.println("centery=" + c1.getCenterY());
//setcentery
c1.setCenterY(30);

//getcenterxy
System.out.println("centerxy=" + c1.getCenterXY()[0]);
//setcenterxy
c1.setCenterXY(400, 300);

//tostring
System.out.println(c1);

//getarea
System.out.println("area=" + c1.getArea());
//getcircum
System.out.println("circumference=" + c1.getCircumference());
//distance
System.out.println("distance=" + c1.distance(c2));

    }
    
}
