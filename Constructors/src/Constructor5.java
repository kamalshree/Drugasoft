/*
 * Use constructor to instialize instance variables
 */
public class Constructor5 {
	int empid;
	String empname;
	float empsal;
	
	public Constructor5(){
		empid=100;
		empname="xxx";
		empsal=10000.34f;
	}
	public void display(){
		System.out.println("Emp Id is "+empid);
		System.out.println("Emp Name is "+empname);
		System.out.println("Emp Salary is "+empsal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor5 c4=new Constructor5();
		Constructor5 c5=new Constructor5();
		c4.display();
		c5.display();
	}

}
