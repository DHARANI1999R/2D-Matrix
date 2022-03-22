package stringpackage;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int[] array1=new int[10];
		int[] array2=new int[10];
		System.out.println("Enter the array1");
		for(int i=0;i<array1.length;i++)
		{
			array1[i]=sn.nextInt();
		}
		System.out.println("Enter the array2:");
		for(int i=0;i<array2.length;i++) 
		{
			array2[i]=sn.nextInt();
		}
		int[] array3=new int[10];
		for(int i=0;i<array3.length;i++)
		{
			array3[i]=array1[i]+array2[i];
			System.out.println(" "+array3[i]);
			
		}
		
		

	}

}
