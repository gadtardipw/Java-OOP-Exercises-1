public class TestMyRectangle {
    public static void main(String[] args) {
        
        //constructor1
        MyRectangle r1 = new MyRectangle(4, 3, 2, 1);
        //construcotr2
        MyPoint p1 = new MyPoint(4, 3);
        MyPoint p2 = new MyPoint(2, 1);

        MyRectangle r2 = new MyRectangle(p1,p2);
        //gettleft
        System.out.println("topleft=" + r1.getTLeft());

        //getbright
        System.out.println("bottomright=" + r1.getBRight());

        //settleft
        r1.setTLeft(p1);

        //setbright
        r1.setBRight(p2);

        //getheight
        System.out.println("height=" + r1.getHeight());

        //get width
        System.out.println("width=" + r1.getWidth());

        //getarea
        System.out.println("area=" + r1.getArea());

        //getperimeter
        System.out.println("perimeter=" + r1.getPerimeter());

        //tostring
        System.out.println(r1);
    }
}
