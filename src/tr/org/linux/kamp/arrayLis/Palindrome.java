package tr.org.linux.kamp.arrayLis;

import java.util.Random;

public class Palindrome {

	public static Random rand = new Random();
	private static int bound = 10;
	private static int[] array = new int[bound];
	
	
	public static void main(String[] args) {
		
		generateArray();
		System.out.println("Array is: ");
		printArray();
		System.out.println("\nArrayin tersi: ");
		simetrrikArray();
		printArray();
		
				
	}
	
	public static void generateArray() {
		int item;
		for (int i = 0; i < array.length; i++) {
			item = rand.nextInt(10); // 0ile9arasında değer
			array[i] = item;
		}
	}
	
	public static void simetrrikArray() {
		
	
		int firstValue=0 ;
		int temp=0;
		
		for(int i=0; i<array.length/2; i++)
		{
			
			temp = array[i];		
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
			
		}
		
	}
	public static void printArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	
	
}
	
}
