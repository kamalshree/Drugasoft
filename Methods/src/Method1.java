/*
 * Method with Primitive datatypes
 * 
 */
public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method1 o1=new Method1();
		o1.m1(10, 'x');
	}
	
	public void m1(int a,char c){//local variables
		System.out.println("instance block");
		System.out.println("value of a is "+a);
		System.out.println("value of c is "+c);
	}

}
