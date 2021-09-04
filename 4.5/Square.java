public class Square extends Rectangle {
    
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super.setColor(color);
        super.setFilled(filled);
        super.setWidth(side);
        super.setLength(side);
    }

    public double getSide() {
        return super.getLength();
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }


}
