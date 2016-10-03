/* **************************************************************
 * Jean Gourd
 * GameOfLife.java
 * 2016-09-02
 *
 * Game of Life implementation using a multi-dimensional array.
 ************************************************************** */

import java.util.Scanner;
//import java.io.*;

public class GOL
{
	public static final int MAX_WIDTH = 40;

	private static int numGens = 10;
	private static int genInt = 1;
	private static int animate = 0;
	private static boolean debug = false;

	public static void main(String[] args)
	{
		boolean[][] board;
		ParseCmdLine(args);
		board = ReadGen0();
		DisplayBoard(board, 0);
		
		for (int i =1; i<=numGens; i++)
		{
			board = ComputeGen(board);
			if (i % genInt ==0)
			{
				DisplayBoard(board, i);
			}	
			
		}
	}

	// parses the command line for parameters
	public static void ParseCmdLine(String[] args)
	{
		if (args.length == 0)
		{
			ShowUsage();
			System.exit(0);
		}

		for (int i=0; i<args.length; i++)
		{
			// default values
			if (args[i].equals("-D"))
				break;
			// help/usage
			if (args[i].equals("-h"))
			{
				ShowUsage();
				System.exit(0);
			}
			// debug
			if (args[i].equals("-d"))
				debug = true;
			// number of generations to produce
			else if (args[i].startsWith("-n"))
				numGens = Integer.parseInt(args[i].substring(2));
			// display generation interval
			else if (args[i].startsWith("-i"))
				genInt = Integer.parseInt(args[i].substring(2));
			// animation delay
			else if (args[i].startsWith("-a"))
				animate = Integer.parseInt(args[i].substring(2));
		}
		// display debug information if specified
		if (debug)
			System.out.println("numGens=" + numGens + "; genInt=" + genInt + "; animate=" + animate);
	}

	// displays help/usage
	public static void ShowUsage()
	{
		System.out.println("Usage: java GameOfLife [-h] -D [-(nia)<val>]");
		System.out.println(" e.g.: java GameOfLife -D < gen0");
		System.out.println("  -D\t\tUse default values");
		System.out.println("  -n<val>\tSet the number of generations to produce to <val> (=10)");
		System.out.println("  -i<val>\tSet the generation display interval to <val> (=1)");
		System.out.println("  -a<val>\tSuperpose each generation and delay <val> milliseconds");
		System.out.println("  -h\t\tShow this screen");
	}

	// reads the initial generation
	public static boolean[][] ReadGen0()
	{
		boolean[][] board =null;
		Scanner s = new Scanner(System.in);
		String line;
		int r = 0;
		
		while (s.hasNextLine())
		{
			line = s.nextLine();
			if (r==0)
			{
				board = new boolean[line.length()][line.lenth()];
			}
			
			for (int c =0; c<line.length(); c++)
			{
				board [r][c] = (line.charAt(i) == '*');
				
			}
			
			r++;
		}
		return board;
	
	}

	// displays the current board
	public static void DisplayBoard(boolean[][] board, int gen)
	{
		System.out.println("Gen" + gen + ":")
		
		for (int r =0; r<board.length-1; r++)
		{
			if (r ==1)
			{
				System.our.print(" ");
				for (int c =1; c<board.length -1; c++)
				{
					System.out.
				}
			
			}
			
		}
	}

	// given a current generation, computes the next
	public static boolean[][] ComputeGen(boolean[][] board)
	{
		return board;
	}
}