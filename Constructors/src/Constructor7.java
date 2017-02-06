
/*
 * using static variable in constructor
 */
public class Constructor7{
	int empid;
	String empname;
	float empsal;
	static String emporgname;
	
	public Constructor7(int empid,String empname,float empsal,String emporgname){
		this.empid=empid;
		this.empname=empname;
		this.empsal=empsal;
		Constructor7.emporgname=emporgname;
	}
	public void display(){
		System.out.println("Emp Id is "+empid);
		System.out.println("Emp Name is "+empname);
		System.out.println("Emp Salary is "+empsal);
		System.out.println("Emp organization is "+emporgname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor7 c4=new Constructor7(111,"xxx",10000.34f,"abc corp");
		Constructor7 c5=new Constructor7(222,"yyy",12000.45f,"abc corp");
		c4.display();
		c5.display();
	}

}