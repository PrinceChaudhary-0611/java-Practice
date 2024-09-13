package practice;

import java.util.Scanner;

public class ArrayOperations {
	static Scanner sc = new Scanner(System.in);
	int i = 0;
	static int size;
	static {
		System.out.print("Enter the size of an array.     ");
		size = sc.nextInt();
	}
	static int arr[]= new int[size];
	int newArray[] = new int[arr.length-1];
	 
	public static void CreateIntArray() {
		
		
		System.out.println("create block");
			
		System.out.print("Enter the size of an array: -  ");
		 int size =sc.nextInt();
		arr = new int[size];
		
	}
	
	public void DisplayArray()
	{
		System.out.println("display block");
		for(i=0;i<arr.length;i++)
		{
			System.out.println("Element at index "+i+" is "+arr[i]);
		}
	}

	
	public void InsertIntoArray()
	{
		System.out.println("insert block");
		for(i=0; i<=(arr.length-1); i++)
		{
			System.out.println("Enter an element:-  ");
			int element = sc.nextInt();
			arr[i] = element;
		}
	}

	public void RemoveElementFromIndex()
	{
		System.out.println("index remove block");
		System.out.println("Enter a index value of element: -  ");
		int index = sc.nextInt();
		for(i=0; i<index;i++)
		{
			this.newArray[i] = arr[i];
			
		}
		
		for(i=index;i<newArray.length;i++) {
			this.newArray[i]=arr[i+1];
		}
	}
	
	public void DisplayUpdatedArray()
	{
		System.out.println("display block");
		for(i=0;i<newArray.length;i++)
		{
			System.out.println("Element at index "+i+" is "+newArray[i]);
		}
	}

	public void RemoveElement()
	{
		System.out.println("remove element block");
		System.out.println("Enter an element to remove from array: -  ");
		int element = sc.nextInt();
		int index = 0;
		boolean value= false;
	
		for(i=0;i<=arr.length;i++);
		{
			if(arr[i]==element)
			{
				index=arr[i];
				value = true;
			}
		}
		if(value == true)
		{
			for(i=0;i<index;i++)
			{
				newArray[i]=arr[i];
			}
			for(i=index+1;i<newArray.length;i++)
			{
				newArray[i]=arr[i];
			}
		}
		else
		{
			System.out.print("Element not found....");
		}
	}
}
