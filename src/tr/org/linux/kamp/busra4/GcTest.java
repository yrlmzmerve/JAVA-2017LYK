package tr.org.linux.kamp.busra4;

public class GcTest {
	
	int value;
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println(this.value + " için Garbage collector çalıştı");
	}

}
