/*
 * use this keyword to transfer the values from local variables to instance variables.
 */
public class Constructor6{
	int empid;
	String empname;
	float empsal;
	static String emporgname;
	
	public Constructor6(int empid,String empname,float empsal){
		this.empid=empid;
		this.empname=empname;
		this.empsal=empsal;
		emporgname="abc corp";
	}
	public void display(){
		System.out.println("Emp Id is "+empid);
		System.out.println("Emp Name is "+empname);
		System.out.println("Emp Salary is "+empsal);
		System.out.println("Emp organization is "+emporgname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor6 c4=new Constructor6(111,"xxx",10000.34f);
		Constructor6 c5=new Constructor6(222,"yyy",12000.45f);
		c4.display();
		c5.display();
	}

}