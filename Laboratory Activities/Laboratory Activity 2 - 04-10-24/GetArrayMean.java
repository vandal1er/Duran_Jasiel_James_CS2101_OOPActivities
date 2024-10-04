import java.util.Scanner;

public class GetArrayMean {
	
	public static float getArrayMean(float[] array)
	{
		float sum = 0f;
		for (float i : array)
		{
			sum += i;
		}
		
		float result = sum/array.length;
		
		return result;
	}
	
	public static void main(String[] args) 
	{
		int size = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		size = input.nextInt();
		
		float[] arr = new float[size];
		
		for (int i = 0; i < size; i++)
		{
			System.out.print("Enter number: ");
			arr[i] = input.nextFloat();
		}
		
		System.out.print( "Mean of array is: ");
		
		System.out.printf("%.2f",getArrayMean(arr));
	}
}
