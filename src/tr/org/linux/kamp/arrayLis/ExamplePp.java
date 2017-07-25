package tr.org.linux.kamp.arrayLis;

import java.util.Arrays;
import java.util.Random;

public class ExamplePp {

	// random deperden olurmus bır array yap
	// int array -
	// min ve maxı bul
	// max-min olmadan average bul
	
	static int minCounter = 1;
	static int maxCounter = 1;

	public static void main(String[] args) {
		int[] integerArray = { 5, 7, 3, 4, 9, 2, 14, 15, 15, 1, 1, 15 };

		System.out.println(Arrays.toString(integerArray));
		int max = max(integerArray);
		int min = min(integerArray);String
		int sum = sum(integerArray);
		sum = sum - min - max;

		int average = (sum / (integerArray.length - (minCounter + maxCounter)));
		System.out.println("minCounter= " + minCounter);
		System.out.println("maxCounter= " + maxCounter);
		System.out.println("sum= " + sum);
		System.out.println("max= " + max);
		System.out.println("min= " + min);
		System.out.println("average= " + average);
		
	}

	public static int[] sort(int[] paramArray) {
		Arrays.sort(paramArray);
		return paramArray;

	}

	public static int max(int[] paramArray) {
		sort(paramArray);
		int max = paramArray[paramArray.length - 1];
		for (int i = 1; i < paramArray.length; i++) {
			if (paramArray[i] == max) {
				maxCounter++;
			}
		}
		return max;
	}

	public static int min(int[] paramArray) {
		sort(paramArray);
		int min = paramArray[0];
		for (int i = 1; i < paramArray.length; i++) {
			if (paramArray[i] == min) {
				minCounter++;
			}

		}
		return min;
	}

	public static int sum(int[] paramArray) {
		int sum = 0;
		for (int i = 1; i < paramArray.length; i++) {
			sum += paramArray[i];
		}

		return sum;
	}

	/*private static int[] arrayA = new int[8];
	private static Random rand = new Random();

	public static void main(String[] args) {
		createArray();
		printArray();
		
		 System.out.println("\nMax value is: " + maxFound());
		 System.out.println("\nMin value is: " + minFound());
		 //System.out.println("\nAvareage is: "+ averageCal());
		 

	}

	private static void createArray() {

		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = rand.nextInt(10);
		}
	}
	
	public static int sum() {
	
		int sum=0;
		for(int )
	
	}
	
		

	public static int[] sort() {
		Arrays.sort(arrayA);
		return arrayA;
	}

	public static int maxFound() {
		sort();
		return arrayA[arrayA.length - 1];
	}

	public static int minFound() {
		sort();
		return arrayA[0];
	}

	/*
	 * public static int searchMax() { int max = arrayA[0]; for (int i = 1; i <
	 * arrayA.length; i++) { if (arrayA[i] > max) { max = arrayA[i]; } }
	 * 
	 * return max; }
	 * 
	 * public static int searchMin() { int min = arrayA[0]; for (int i = 1; i <
	 * arrayA.length; i++) { if (arrayA[i] < min) { min = arrayA[i]; } } return min;
	 * 
	 * 
	 * public static double averageCal() {
	 * 
	 * double ave = 0,sum=0; for(int i=0; i<arrayA.length; i++) { sum+=arrayA[i]; }
	 * int max= searchMax(); int min=searchMin(); sum=sum-(max+min); ave =
	 * sum/(arrayA.length-2); return ave; } }
	 */

	/*public static void printArray() {
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");

		}
		System.out.println();
	}*/

}
