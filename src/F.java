package src;

public class F extends Super{
	

	public int i = 99;
	
	public F() {
		
		System.out.println("F const");

	}
	
	public F(int i) {
		this();
		
		System.out.println("F param is i");
	}
	
	public int getNum() {
		return super.i;
	}
	
	public void s(int i ) {
		this.i= i; 
	}
	
	public void override() {
		System.out.println("Over F");
//		return new F(); 
	}

}
