/*
 * this keyword in constructors
 * 
 */
public class Constructor8 {

	public Constructor8() {
		this(10);
		System.out.println("0 arg constructor");
		//this(10); must always be the first line in constructor
	}

	public Constructor8(int a) {
		this("zzz");
		//this("zzz"); 2 this not possible
		System.out.println("1 arg constructor");
	}

	public Constructor8(String s) {
		System.out.println("1 string arg constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor8 c1=new Constructor8();
	}

}
