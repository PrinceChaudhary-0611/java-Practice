package practice;

import java.util.Scanner;

public class ArrayDriver {
	
	static Scanner sc = new Scanner(System.in);

	public static void Start()
	{

		System.out.println("Start block");
		ArrayOperations AO = new ArrayOperations();
		System.out.print("Press '1' for create array");
		System.out.print("\nPress '2' for display ");
		System.out.print("\nPress '3' for updated display ");
		System.out.print("\nPress '4' for insert ");
		System.out.print("\nPress '5' for remove element using index ");
		System.out.print("\nPress '6' for remove element using element ");
		int n= sc.nextInt();
		switch(n){
		case 1: 
			System.out.print("Enter the size of an array: -  ");
			int size = sc.nextInt();
			System.out.println("case 1 block");
			AO.CreateIntArray();			
			break;
		case 2:
			System.out.println("case 2 block");
			AO.DisplayArray();
			break;
		case 3:
			System.out.println("case 3 block");
			AO.DisplayUpdatedArray();
			break;
		case 4:
			System.out.println("case 3 block");
			AO.InsertIntoArray();
			break;
		case 5:
			System.out.println("case 4 block");
			AO.RemoveElementFromIndex();
			break;
		case 6:
			System.out.println("case 5 block");
			AO.RemoveElement();
			break;
		default:
			System.out.println(" default case block");
			System.out.println();
			System.out.println("Invalid input");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main block");
		for(int i = 0; i>= 0; i++)
		{
			Start();
			System.out.println("Do you want to continue.....\n If yes press 'y' if no then press 'n'");
			char ch = sc.next().charAt(0);
			switch(ch)
			{
			case 'y':
			case 'Y':
				System.out.println("case y block");
				Start();
				break;
			case 'n':
			case 'N':
				System.out.println("case n block");
				break;
			default:
				System.out.println("case block");
				System.out.print("\nInvalid input please press 'y' or 'n'");
				Start();
			}	
		}
		
	}
	

}
