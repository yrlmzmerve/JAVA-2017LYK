package tr.org.linux.kamp.hipo;

public class Triangle {
	
	private int a;
	private int b;
	
	public Triangle(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public Triangle() {}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int getHipo(int a, int b) {		
		return (int)(Math.hypot(a, b));		
	}
	
	public int calPelimeter(int a,int b) {		
		return a+b+getHipo(a, b);
	}
	
	public int getArea(int a, int b) {
		return (a*b)/2;
	}
	
	

}
