/*
 * Difference between Constructor and Instance block
 */
public class Instance3 {
	
	{
		System.out.println("To be executed for every objects creation");
	}
	
	public Instance3(){
		System.out.println("0 arg constructor");
	}

	public Instance3(int a ){
		System.out.println("1 arg constructor");
	}
	public Instance3(int a, int b){
		System.out.println("2 arg constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance3 obj1=new Instance3();
		Instance3 obj2=new Instance3(10);
		Instance3 obj3=new Instance3(10,20);
		System.out.println("Class name of obj1 "+obj1.getClass().getName());
	}

}
