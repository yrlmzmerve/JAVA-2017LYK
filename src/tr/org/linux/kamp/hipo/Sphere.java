package tr.org.linux.kamp.hipo;

import java.util.Scanner;

public class Sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a radious for sphere: ");
		int radious = input.nextInt();
		System.out.println("Volume is: " + calHacim(radious));

	}

	public static int calHacim(int rad) {

		return (int) ((4 / 3) * Math.PI * Math.pow(rad, 3));
	}

}
