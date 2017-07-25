package tr.org.linux.kamp.genArray;

import java.util.Random;

public class SortArrayy {

	private static Random rand = new Random();
	private static int bound = 10;
	private static int[] array = new int[bound];

	public static void main(String[] args) {

		generateArray();
		printArray();
		System.out.println("\n");
		sortAr();
		System.out.print("Array is sorting.. : ");
		printArray();
		System.out.println("\n" + searchItem(3));
		if(lastIndexOf(4)==-1)
			System.out.println("Value is NOT found..");
		else
			System.out.println("Value is found..");

	}

	public static int lastIndexOf(int item) {

		for (int i = array.length-1; i >= 0; i--) {

			if (array[i] == item) {
				return i;
			}

		}
		return -1;

	}

	public static void generateArray() {
		int item;
		for (int i = 0; i < array.length; i++) {
			item = rand.nextInt(10); // 0ile9arasında değer
			array[i] = item;
		}

	}

	public static boolean searchItem(int value) {
		for (int i = 0; i < array.length; i++) {

			if (value == array[i])
				return true;
		}
		return false;
	}

	public static void sortAr() {

		int temp = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {

				if (array[j - 1] > array[j]) {

					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}

			}

		}
	}

	public static void printArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}

	}

}
