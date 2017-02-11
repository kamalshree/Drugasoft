package arrays.examples;

class Test{
	
}
public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		Example11 e=new Example11();
		
		Test[] tt=new Test[2];
		
		tt[0]=new Test();
		//tt[1]=new Example11();
		
		System.out.println(tt[0] instanceof Test);
		//System.out.println(tt[0] instanceof Example11);
		System.out.println(tt[1] instanceof Test);
		//System.out.println(tt[1] instanceof Example11);
	}

}
