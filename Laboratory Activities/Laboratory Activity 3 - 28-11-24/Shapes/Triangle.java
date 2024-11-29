public class Triangle implements Shape{

    private double c;
    private double b;
    private double a;

    public Triangle(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea()
    {
        double s = (a + b + c)/2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    public double getPerimeter()
    {
        return a + b + c;
    }

    public void printShapeType()
    {
        System.out.print("Triangle");
    }
}
