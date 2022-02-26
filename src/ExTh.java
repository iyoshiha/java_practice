package src;

public class ExTh {
	
	int i = 10;
	String str;
	
	public void thr(String str) throws NullPointerException {
		if (str.equals(null)) {
		System.out.println(str);
		}
		System.out.println("thr method done");
	
	}
	
	public void s() {
		this.thr(null);
	}
	public void exc(String str) {
	try{
		System.out.println("try in exc");
	    /*１：処理*/
//		str = null;
		s();
		if (str.equals(null))
		System.out.println("try 2");

	}catch(NullPointerException e){
	    /*２：例外発生時の処理*/
		System.out.println("Null is given");
	}
	}
	
	public void crash() {
		if (str.equals(null));
	}
	
	public void zero() throws NullPointerException {

		try{
			if (str.equals(null));
			System.out.println(100 / 0);
			System.out.println("try in exc");

		}catch(ArithmeticException e){

			System.out.println("0 is given");
		}

		System.exit(1);
		
	}
}
