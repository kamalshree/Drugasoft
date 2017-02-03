
public class InstanceVersusStatic {
	
	String empName;
	static String orgName ="XXX LTD";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVersusStatic obj1=new InstanceVersusStatic();
		obj1.empName="john";
		System.out.println(obj1.empName);
		System.out.println(InstanceVersusStatic.orgName);
		
		InstanceVersusStatic obj2=new InstanceVersusStatic();
		
		obj1.empName="Jack";
		System.out.println(obj1.empName);
		System.out.println(InstanceVersusStatic.orgName);
		
		InstanceVersusStatic obj3=new InstanceVersusStatic();
		
		obj1.empName="Lily";
		System.out.println(obj1.empName);
		System.out.println(InstanceVersusStatic.orgName);
		
		
	}
	

}
