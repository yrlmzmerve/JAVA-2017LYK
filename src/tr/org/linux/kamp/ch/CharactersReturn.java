package tr.org.linux.kamp.ch;

import java.util.Random;

public class CharactersReturn {

	private static Random rgen = new Random();

	public static void main(String[] args) {

		/*
		 * //*ASCII table char a='a'; char b= 97; System.out.println((int)a);
		 * System.out.println(b); System.out.println(1+'a');
		 * 
		 * //isLoverCase- UpperCase //isDigit //isLetter // Random number
		 * rgen.nextInt();
		 * 
		 */

		/*
		 * String a = new String("hello"); String b = new String("hello"); if(a==b)
		 * System.out.println("bu -true"); System.out.println("Now false");
		 * 
		 * 
		 * //ch = Character.toUpperCase(ch);
		 * 
		 * String str ="hello,word"; System.out.println(str.toUpperCase());
		 * System.out.println("....");
		 * 
		 * 
		 * char anyy = (char)((rgen.nextInt(25) )+'A'); System.out.println(anyy);
		 * 
		 * 
		 * //dönüştürken //Integer.toString(155); //str=hello word //str.charAt(10);
		 * ---> sout içinde //array sınır aşma uyarısı veriyor.
		 * 
		 * //stringlerde concatiation if("hello" == "hello") {
		 * System.out.println("true"); }
		 * 
		 * //str.substring(p1,p1) //p1 dahil-p2 değil
		 * 
		 * System.out.println("--"+str.substring(4,6));
		 * 
		 * 
		 * //Stringde arama System.out.println(str.indexOf("el"));
		 * 
		 * //boşluktan sonrasını bulma System.out.println(str.charAt(str.length()-1));
		 * 
		 * //sondan ilk buldugu System.out.println(str.lastIndexOf(4));
		 * 
		 * 
		 * //o ispatladık false :D System.out.println("dogrumu yanlıs mı");
		 * System.out.println(str.substring(0, 2)=="he"); //false - referans kıyaslaması
		 * 
		 * 
		 * System.out.println(str.substring(0, 2).equals("he")); //true - içerik
		 * kıyaslaması
		 * 
		 */

		// ctrl+shift+7

		String word = "merve.@ss.aaa";
		System.out.println(toUpperCase(word).equals(word.toUpperCase()));

		// REVERSE STRING
		System.out.println(reverseString(word));

		// Email VALIDATION

		System.out.println(isEmailValidation(word));

	}

	public static String toUpperCase(String a) {

		/*
		 * String newWord=a.toUpperCase(); if(a.equals("MERVE"));
		 * System.out.println("TRUE"); return newWord;
		 */

		String result = "";
		for (int i = 0; i < a.length(); i++) {
			result += Character.toUpperCase(a.charAt(i));
		}

		return result;

	}

	public static String reverseString(String str) {

		String result = "";
		/*
		 * for(int i=str.length()-1; i>=0; i--) {
		 * 
		 * result+=str.charAt(i); }
		 */

		for (int i = 0; i < str.length() - 1; i++) {

			result += str.charAt(str.length() - 1 - i);

		}
		return str;


	
	
	}

	
	//sezar şifrelemesi 
	//CaesarCipher 
	
	public static boolean isPalindrome(String str) {
		return str.equals(reverseString(str));
	}

	public static boolean isEmailValidation(String str) {

		if (str.contains(" ") == false &&  //bosluk olmayacak
				str.contains("@") == true && str.contains(".") == true //@ ve . olacak
				&& str.indexOf('@') != 0 && str.indexOf('.') != 0 &&  //ilk başta olmayacaklar
				(str.indexOf('.') + 2 <= str.length()) //. dan sonra en az 2 harf olucak
				&& (str.indexOf('@') + 1) != (str.indexOf('.'))  // @ ile . arasında en az 1 
				&& (str.indexOf('.')+1 != str.indexOf('@')) ) {

			System.out.println("Burdayız");
			return true;

		} 
	
			
		return false;
		
//str.startsWith("@") || str.startsWith(".") ) { return false;}
		// indexOf -2 mi değil mi if(str.contains("@.");

	}
}
