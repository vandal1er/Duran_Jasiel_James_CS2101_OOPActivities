import java.util.Scanner;

public class GettingGreater 
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Getting the Greater Value");
		System.out.print("Enter the first character: ");
		char a = input.next().charAt(0);
		System.out.print("Enter the second character: ");
		char b = input.next().charAt(0);
		
		char c = (char) Math.max(a, b);
		
		System.out.println("--------------------------------------------");	
		System.out.println("The character with greater value is "+ c);
		System.out.println("--------------------------------------------");	
		System.out.println("Showing the ASCII Codes");
		System.out.println(a + " : " + (int)a);
		System.out.println(b + " : " + (int)b);
		
		input.close()
	}
}
