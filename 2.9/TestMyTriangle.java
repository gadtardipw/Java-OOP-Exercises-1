public class TestMyTriangle {
    public static void main(String[] args) {

        //constructor 1
        MyTriangle t1 = new MyTriangle(1, 2, 3, 4, 5, 6);
        //constructor 2
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(2, 3);
        MyPoint p3 = new MyPoint(4, 0);

        MyTriangle t2 = new MyTriangle(p1, p2, p3);

        //toString
        System.out.println(t2);

        //getperimeter
        System.out.println("perimeter="+ t2.getPerimeter());

        //gettype
        System.out.println("type=" + t2.getType());
    }
    
}
