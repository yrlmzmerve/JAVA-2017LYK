package tr.org.linux.kamp.hipo;

import java.util.Random;
import java.util.Scanner;

public class hipotenusRet {

	private static Random rgen = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Triangle tr1 = new Triangle();
		System.out.println("Enter two edges : ");
		int edgeA=input.nextInt();
		int edgeB=input.nextInt();
		tr1.setA(edgeA);
		tr1.setB(edgeB);
		
		System.out.println("Triangle hipotenüs is: "+ tr1.getHipo(tr1.getA(), tr1.getB()));
		System.out.println("Triangle pelimeter is: "+ tr1.calPelimeter(tr1.getA(), tr1.getB() ) );
		System.out.println("Triangle area is: "+ tr1.getArea((tr1.getA() ), tr1.getB()));

	}
	
	

}
