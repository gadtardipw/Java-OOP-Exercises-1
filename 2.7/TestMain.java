public class TestMain {
    public static void main(String[] args){

    MyLine l1 = new MyLine(40, 30, 20, 10);

    MyPoint p1 = new MyPoint(4, 3);
    MyPoint p2 = new MyPoint(2, 1);

    MyLine l2 = new MyLine(p1,p2);

   //getbegin
   System.out.println("l1 begin=" + l1.getBegin());
   //setbegin
   l1.setBegin(p1);
   //getend
   System.out.println("l1 end=" + l1.getEnd());
   //setend
   l1.setEnd(p2);
   //getbeginx
   System.out.println("l1 beginX=" + l1.getBeginX());
   //setbeginx
   l1.setBeginX(400);
   //getbeginy
   System.out.println("l1 beginY=" + l1.getBeginY());
   //setbeginy
   l1.setBeginY(300);
   //getendx
   System.out.println("l1 endX=" + l1.getEndX());
   //setendx
   l1.setEndX(200);
   //getendy
   System.out.println("l1 endY=" + l1.getEndY());
   //setendy
   l1.setEndY(200);
   //getbeginxy
   System.out.println("l1 beginXY=" + l1.getBeginXY()[0]);
   //setbeginxy
   l1.setBeginXY(4000,3000);
   //getendxy
   System.out.println("l1 endXY=" + l1.getEndXY()[1]);
   //setendxy
   l1.setEndXY(2000,1000);
   //getlength
   System.out.println("l1 length=" + l1.getLength());
   //getgradient
   System.out.println("l1 gradient=" + l1.getGradient());
   //tostring
   System.out.println(l1);

    }
    
}
