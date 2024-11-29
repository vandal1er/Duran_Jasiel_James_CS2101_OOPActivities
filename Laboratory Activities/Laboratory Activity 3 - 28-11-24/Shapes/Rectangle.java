public class Rectangle implements Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public double getArea()
    {
        return length * width;
    }

    public double getPerimeter()
    {
        return (length * 2) + (width * 2);
    }

    public void printShapeType()
    {
        System.out.print("Rectangle");
    }
}
