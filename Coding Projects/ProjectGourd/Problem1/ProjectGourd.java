import java.util.Scanner;
import java.util.ArrayList;
public class ProjectGourd
{
	//vars
	private static String firstDigitString = new String("");
	private static int[] myArray  = new int[10];
	
	
	//main
	public static void main(String[] args)
	{
		/*for (int i =0; i<myArray.length; i++)
			System.out.println(myArray[i]);*/
		//System.out.println(firstDigitString);
		inputReader();
		
		
		for (int i = 0; i<10; i++)
		{
			char b = Integer.toString(i).charAt(0);
			//System.out.println(b);
			
			myArray[i] = calculateCount(b, firstDigitString);
			System.out.println(myArray[i]);
		}
		printResults();
	}
	
	public static int calculateCount(char c, String s)
	{
		int counter = 0;
		for (int i =0; i<s.length(); i++)
		{
			if (s.charAt(i) == c)
			{
				counter++;
			}
		}
		//System.out.println(counter);
		return counter;
	}
	
	public static void inputReader()
	{
		Scanner s = new Scanner(System.in);
		
		while (s.hasNextInt())
		{
			int inputInt = s.nextInt();
			//System.out.println(inputInt);
			
			int firstDigit = getFirstDigit(inputInt);
			//System.out.println(firstDigit);
			
			
			//add the first digit to the firstDigitString
			firstDigitString += Integer.toString(firstDigit);
			//System.out.println(firstDigitString);
			
			
			
			
		}
	}
	
	public static void printResults()
	{
		System.out.println("--------------------------------");
		System.out.println("Leading Digit  Count           %");
		System.out.println("--------------------------------");
		String line0 = String.format("0              %1$d", myArray[0]);
		String line1 = String.format("1              %1$d", myArray[1]);
		System.out.println(line0);
		System.out.println(line1);
		double d1 = ((double)myArray[1])/firstDigitString.length()*100;
		System.out.printf("%.2f",d1);
		System.out.println(myArray[1]/firstDigitString.length()*100.00);
		System.out.println(myArray[1]);
		System.out.println(firstDigitString.length());
	}
	
	public static int getFirstDigit(int x)
	{
		while (x > 9)
		{
			x /=10;
		}
		return x;
	}
}