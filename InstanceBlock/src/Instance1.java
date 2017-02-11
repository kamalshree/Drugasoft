/*
 * Instance Block
 * 
 */
public class Instance1 {
	
	{
		System.out.println("Instance Block1");
	}

	public Instance1(){
		System.out.println("zero arg constructor");
	}
	{
		System.out.println("Instance Block2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Instance1();
		new Instance1();
	}

}
