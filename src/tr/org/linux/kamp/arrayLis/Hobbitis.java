package tr.org.linux.kamp.arrayLis;

public class Hobbitis {
	
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hobbitis[] hobit=new Hobbitis[3];
		int z=0;
		while(z<3) {
			
			hobit[z]= new Hobbitis();
			hobit[z].name="Frodo";
			
			if(z==1) {
				hobit[z].name="Bilbo";
			}
			if(z==2) {
				hobit[z].name="Sam";
				
			}
			System.out.println(hobit[z].name+"");
			z++;
		}
		
		

	}

}
