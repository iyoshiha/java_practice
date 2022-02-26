package src;

public class Super {
	public int i = 1;
	public final int fi = 90;
	public int x = 900;
	public void setNum(int i) {
		this.i = i;
	}
	
	public int p() {
		return i;
	}
	
	public void v()
	{
		System.out.println("v method occured ");
	}
	
	public Super() {
		System.out.println("Super const");
	}
	
	public Super(int i) {
		System.out.println("Overroad i: Super const");
	}
	
	public void override() {
		System.out.println("Over Super");
//		return new F();
	}
	
}
