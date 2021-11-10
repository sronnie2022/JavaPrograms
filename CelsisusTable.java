import java.util.Scanner;

public class CelsisusTable
{
  public static void main(String[] args)
  {
	 System.out.println("Celsius\tFahrenheit");
	 for(int i = 40; i >= 31; i--)
	 System.out.printf("%.1f\t%.1f\n", (float)i, celsiusToFahrenheit(i));

	 System.out.println("Fahrenheit\tCelsius");
	 for(int i = 120; i >= 30; i-=10)
	 System.out.printf("%.1f\t%.1f\n", (float)i, fahrenheitToCelsius(i));


  }// end main method



	 public static double celsiusToFahrenheit(double celsius)
	 {
	 	return (9.0 / 5) * celsius + 32;
     }
     public static double fahrenheitToCelsius(double fahrenheit)
	 {
	 	return (5.0 / 9) * (fahrenheit - 32);
	 }


}// end CelsiusTable class