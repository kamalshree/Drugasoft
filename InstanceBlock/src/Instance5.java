/*
 * Intialize instance variable in Instance block
 * calling instance method in Instance block
 * 
 */
public class Instance5 {
	public int empid;
	
	{
		empid=100;
		display();
	}
	
	public void display(){
		System.out.println(empid);
	}
	{
		empid=123;
		display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Instance5();
	}

}
