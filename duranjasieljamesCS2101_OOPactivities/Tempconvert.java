package duranjasieljamesCS2101_OOPactivities;
import java.util.Scanner;

public class Tempconvert {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Celsius value: ");
        float celsius = scanner.nextFloat();

        float fahr = (celsius * (9f / 5f)) + 32f;
        System.out.println(String.format("%.2f Celsius is %.2f Fahrenheit", celsius, fahr));
        scanner.close();
    }
}
