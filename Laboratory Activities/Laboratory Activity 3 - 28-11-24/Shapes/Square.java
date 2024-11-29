public class Square extends Shape{
private double side;

    public Square(double side)
    {
        this.side = side;
    }

    public double getArea()
    {
        return side * side;
    }

    public double getPerimeter()
    {
        return side * 4;
    }

    public void printShapeType()
    {
        System.out.print("Square");
    }
}
