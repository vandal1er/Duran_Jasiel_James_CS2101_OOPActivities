public class Main {
	
	public static void main(String[] args)
	{
		//Car c = new Car("Yellow", 23.4, 'c');
		//System.out.println(c.toString());
	}
	
}

class Car {

	private String color;
	private double price;
	private char size;
	
	public Car(String c, double p, char s)
	{
		color = c;
		price = p;
		size = Character.toUpperCase(s);
	}
	
	public String getColor()
	{
		return color;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public char getSize()
	{
		return size;
	}
	
	public void setColor(String c)
	{
		color = c;
	}
	
	public void getPrice(double p)
	{
		price = p;
	}
	
	public void setSize(char s)
	{
		size = s;
	}
	
	public String toString()
	{
		String fullSize = "N/A";
		switch(size)
		{
			case 'S': fullSize = "small"; break;
			
			case 'M': fullSize = "medium"; break;
			
			case 'L': fullSize = "large"; break;
			
			
		}
		return String.format("Car (%s) - P%.2f - %s",color, price, fullSize);
	}
}
