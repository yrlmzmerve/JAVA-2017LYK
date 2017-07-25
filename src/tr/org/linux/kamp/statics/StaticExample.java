package tr.org.linux.kamp.statics;

public class StaticExample {
	
	public static String myStaticString = "This is a static method";
	public static String staticMet() {
		return "Bu bir static method";
	}
	
	static {
		System.out.println("bla bla.. 1.static blok");
	}
	static {
		System.out.println("bla bla.. 2.static blok");
	}
	
	static {
		int x=5;
		System.out.println(x);
		System.out.println("bla bla.. 3.static blok");
	}
	
	

}
