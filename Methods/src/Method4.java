/*
 * Calling method inside another method
 * 
 */
public class Method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method4 obj1=new Method4();
		obj1.m1();
	}
	
	public void m1(){
		System.out.println("m1 method");
		m2();
	}
	public void m2(){
		System.out.println("m2 method");
		m3();
	}
	public void m3(){
		System.out.println("m3 method");
	}

}
