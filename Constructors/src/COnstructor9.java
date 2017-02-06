/*
 * 
 * Named approach and nameless approach
 */
public class COnstructor9 {
	
	
	public void m1(){
		System.out.println("m1 method"); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		COnstructor9 c1=new COnstructor9();
		c1.m1();//named approach
		new COnstructor9().m1();//nameless approach
	}

}
