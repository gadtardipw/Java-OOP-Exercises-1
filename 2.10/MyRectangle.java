public class MyRectangle {

    private MyPoint tLeft;
    private MyPoint bRight;

    public MyRectangle(int xTL, int yTL, int xBR, int yBR) {
        tLeft = new MyPoint(xTL,yTL);
        bRight = new MyPoint(xBR,yBR);
    }

    public MyRectangle(MyPoint tLeft, MyPoint bRight) {
        this.tLeft = tLeft;
        this.bRight = bRight;
    }

    public MyPoint getTLeft() {
        return tLeft;
    }

    public MyPoint getBRight() {
        return bRight;
    }

    public void setTLeft(MyPoint tLeft) {
        this.tLeft = tLeft;
    }

    public void setBRight(MyPoint bRight) {
        this.bRight = bRight;
    }

    public double getHeight() {
        double height = tLeft.getY() - bRight.getY();
        height = Math.abs(height);
        return height;
    }

    public double getWidth() {
        double width = tLeft.getX() - bRight.getX();
        width = Math.abs(width);
        return width;
    }

    public double getArea() {
        double area = this.getWidth()*this.getHeight();
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2*this.getWidth() + 2*this.getHeight();
        return perimeter;
    }

    public String toString() {
        return "Rectangle[height= " + this.getHeight() + ",width=" + this.getWidth() + "]";
    }



}