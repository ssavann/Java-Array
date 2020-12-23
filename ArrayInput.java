import java.util.Scanner;

public class ArrayInput
{


	private static Scanner scanner = new Scanner(System.in);	//define a scanner first

	public static void main(String[] args)
	{
		
		//it is calling the method "getIntegers"
		int[] myIntegers = getIntegers(5);	//will ask for 5 numbers
		for (int i = 0; i < myIntegers.length; i++)
		{
			System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
		}

		System.out.println("The average is " + getAverage(myIntegers));
	}

	//this method will use the "scanner" to ask user some input
	public static int[] getIntegers(int number)
	{
		System.out.println("Enter " + number + " integer values.\r");
		int[] values = new int[number];

		for (int i = 0; i < values.length; i++)
		{
			values[i] = scanner.nextInt();
		}

		return values;
	}

	//a method to make the sum and divide by the number of units inside the array
	public static double getAverage(int[] array)
	{
		int sum = 0;
		for (int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}

		return (double) sum / (double)array.length;
	}
}