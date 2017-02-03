/*
 * Calling static and instance method and vice verse
 * 
 */
public class Method5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method5.m1();
	}
	
	public static void m1(){
		System.out.println("m1 method");
		Method5.m2(10);
	}
	
	public static void m2(int a){
		System.out.println("m2 method");
		Method5 obj1=new Method5();
		obj1.m3("xxx", 'y');
	}
	public void m3(String s,char c){
		System.out.println("m3 method");
	}
}
