
public class StaticVariable {
	//static Variables
	static int x=100;
	static int y=200;
	
	//static method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticVariable.x);
		System.out.println(StaticVariable.y);
		StaticVariable obj1=new StaticVariable();
		obj1.m1();
	}
	
	//instance method
	public void m1(){
		System.out.println(StaticVariable.x);
		System.out.println(StaticVariable.y);
	}

}
