/*
 * displays the default values
 */
public class Constructor4 {
	int empid;
	String empname;
	float empsal;
	
	public void display(){
		System.out.println("Emp Id is "+empid);
		System.out.println("Emp Name is "+empname);
		System.out.println("Emp Salary is "+empsal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor4 c4=new Constructor4();
		c4.display();
	}

}
