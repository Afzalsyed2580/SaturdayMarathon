package arrays;

import java.util.Scanner;

public class ArraysFloat {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		float arr[]=new float[7];

		System.out.println("Enter Array Elements");

		for(int i=0;i<=arr.length-1;i++)

		{

			System.out.println("Enter the height of Player "+i);

			arr[i]=scan.nextFloat();

		}

		System.out.println("Array Contents Are.... ");

		for(int i=0;i<=arr.length-1;i++)

		{

			System.out.print(arr[i]+" ");

		}

	}

}

