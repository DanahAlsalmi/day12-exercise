public class Square extends Rectangle{

    public Square(){
        super(1.0,1.0);
    }
    public Square(double side){
        super(side);
    }



    public Square(double side, String color, boolean filled) {
        super(side,side, color, filled);
    }

    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);


    }

    @Override
    public double getArea() {
        return getSide()*getSide();
    }

    @Override
    public double getPerimeter() {
        return getSide()*4;
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
