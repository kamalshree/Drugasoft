
public class InstanceVariable {
	
	//instance variables
	int a=10;
	int b=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation
		InstanceVariable ob1=new InstanceVariable();
		//Accessing Instance variable inside Static block
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		//Accessing Instance method inside Static block
		ob1.m1();
	}
	
	void m1(){
	//Accessing Instance variable inside instance block
	System.out.println(a);
	System.out.println(b);
	}

}
