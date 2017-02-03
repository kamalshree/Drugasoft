/*
 * Method with object paramters
 * 
 */
class A{

	public void m2(){
		System.out.println("Class A Method");
	}
}
public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aobj=new A();
		Method2 mobj=new Method2();
		mobj.m1(aobj);
		
	}

	public void m1(A a){
		System.out.println("instance method");
		a.m2();
	}
}
