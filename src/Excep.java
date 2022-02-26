package src;

public class Excep {
	
	int i = 10;
	String str;
	
	public void exc(String str) {
	try{
	    /*１：処理*/
//		str = null;
		if (str.equals(null))
		System.out.println("in try");
	}catch(NullPointerException e){
	    /*２：例外発生時の処理*/
		System.out.println("Null is given");
	}
	}
}
