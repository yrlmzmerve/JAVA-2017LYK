package tr.org.linux.kamp.sezari;

import java.util.Scanner;

//A B C D E
//her birinin sayı olduğunu düşünün
//A=1, B=2, C=3, D=4, E=5
//HELLO WORD --> IFMMP XPSME

//ascii de a->65, A->97
//a'yı sıfır kabul ederek yapmalıyız

//modda dusun

public class CeaserCipher {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word: ");

		String word = input.nextLine(); // bosluktan sonrada alabilmek icin
		System.out.println("Enter a number: ");

		int number = input.nextInt();
		input.nextLine();
		if (number < 0)
			number = 26 - (-number % 26);
		// number=26+number;

		System.out.println("\nReturn value is: " + encryptFun(word, number));
		System.out.println("check function calling..  ");
		chechkEncryp(word, number);

	}

	public static String encryptFun(String word, int num) {

		String newWord = "";
		String returnWord;
		// char letter = 0;
		int indx = 0;
		for (int i = 0; i < word.length(); i++) {

			if(Character.isLetter(word.charAt(i))){
			/* if(word.charAt(i)+num-'a' >=26) */
			{
				/*
				 * letter = 0; letter+=word.charAt(i)+num; letter+=i%26; newWord+=letter;
				 */
				newWord += (char) ('a' + (word.charAt(i) + num - 'a') % 26);

			else if (word.charAt(i) <= 'Z' && word.charAt(i) >= 'A') { // 65 ile 90

				newWord += (char) ('A' + (word.charAt(i) + num - 'A') % 26);

				// result+=(char) 'a' + (ch+key - 'a')%26;

			}

		}
		

		return newWord;
	}

	public static void chechkEncryp(String word, int key) {

		String temp = encryptFun(word, key);
		int num = -key;
		if (num < 0)
			num = 26 + num;
		String temp1 = encryptFun(temp, num);
		System.out.println("encryptFun: " + temp1);

	}

}
