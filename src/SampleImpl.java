package src;

public class SampleImpl implements Sample {
	
	int x = 100;
	int k = 100;
	
	public SampleImpl(){
		System.out.println("constructed successfully");

	}
	
	public void hello() {
		System.out.println("hello");
	}
	
}