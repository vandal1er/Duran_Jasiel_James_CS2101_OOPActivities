import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) 
	{
		int[] x, y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size of the multiplication table: ");
		int size = input.nextInt();
		System.out.println("Multiplication table: ");
		
		x = new int[size];
		y = new int[size];
		
		for (int i = 1; i <= size; i++)
		{
			for (int j = 1; j <= size; j++)
			{
				System.out.printf("%4d", i*j);
			}
			
			System.out.println();
		}
		input.close();
	}
}
