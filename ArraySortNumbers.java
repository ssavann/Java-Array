import java.util.Scanner;

public class ArraySortNumbers
{

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{

		int[] myIntegers = getIntegers(5);
		int[] sorted = sortIntegers(myIntegers);
		printArray(sorted);
	}

	public static int[] getIntegers(int capacity)
	{
		int[] array = new int[capacity];
		System.out.println("Enter " + capacity + " integer values: \r");
		for (int i = 0; i < array.length; i++)
		{
			array[i] = scanner.nextInt();
		}

		return array;
	}


	public static void printArray(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.println("Element " + i + " contents " + array[i]);
		}
	}

	//build a method to copy and sort elements: highest number to lowest number
	public static int[] sortIntegers(int[] array)
	{
		int[] sortedArray = new int[array.length];
		for (int i = 0; i < array.length; i++)
		{
			sortedArray[i] = array[i];
		}

		//build a method to sort elements
		boolean flag = true; 
		int temp;
		while(flag)
		{
			flag = false; 
			for (int i = 0; i < sortedArray.length -1; i++)
			{	
				//will check if element on position "zero" is lower than the next element [i + 1], if not we need to swap them
				if(sortedArray[i] < sortedArray[i + 1])
				{
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;
					flag = true;

				}
			}

		}

		return sortedArray;
	}

	

}