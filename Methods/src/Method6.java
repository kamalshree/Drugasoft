/*
 * Instance variable and local variables 
 * 
 */
public class Method6 {

	//instance variable
	int x=100;
	static int y=200;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method6 obj1=new Method6();
		obj1.add(10, 20);
	}
	
	public void add(int a,int b){
		System.out.println("x and y "+(x+Method6.y));
		System.out.println("a and b  "+(a+b));
	}

}
