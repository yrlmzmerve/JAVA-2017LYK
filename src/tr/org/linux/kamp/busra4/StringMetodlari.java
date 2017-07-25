package tr.org.linux.kamp.busra4;

//JVM 

//system.gc --> process
// bu mainide silebilir.
//
//compile time -running time 

// finalize --> objeler üzerinde işlemler yapabiliyor.

//java da bellek = jvm üzerindeki sanal bellek --> java heap de
//



//CAFEDEAD
public class StringMetodlari {

	public static void main(String[] args) throws Throwable {
		

			Runtime rt = Runtime.getRuntime();
			System.out.println("Toplam bellek : " + rt.totalMemory());
			
			System.out.println("boş bellek : " + rt.freeMemory());
			String str = new String("Linux yaz kampı");
			String str1 = new String("java programlama");
			System.out.println(str);
			str = str1; //referans değişimi 
			
			System.out.println(str);
			str = null;
		//	System.gc();
			
			
			for(int i = 0 ; i < 10000 ; i++ ) {
				GcTest gcTest = new GcTest();
				gcTest.value = i;
				gcTest = null;
			}

			System.gc(); //Runtime.getRuntime().gc de aynı işlemi yapar.
			
			System.out.println("boş bellek garbage collector çalıştıktan sonra : " + rt.freeMemory());


		
			
		}
	

}
