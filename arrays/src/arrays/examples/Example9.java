/*
 * instanceof
 * 
 */
package arrays.examples;

class A{}


public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example9 e=new Example9();
		A a=new A();
		System.out.println(e instanceof Example9); 
		System.out.println(a instanceof A);
		//System.out.println(e instanceof A);
		//System.out.println(a instanceof Example9); 
		
		A[] a1=new A[2];
		a1[1]=a;
		//a1[0]=e;
		System.out.println(a1[0]);
		System.out.println(a1[1] instanceof A);
		
		//System.out.println(a1[0] instanceof Example9);

		
	}

}
