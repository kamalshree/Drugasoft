
public class DefaultValues {
	
	byte b;
	short s;
	int i;
	long l;
	
	static float f;
	static double d;
	
	char c;
	boolean bool;
	
	LocalVariable1 x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultValues obj1=new DefaultValues();
		obj1.m1();
	}
	
	void m1(){
		
		int LV;//local variables needs to be assigned
		System.out.println("Default values");
		System.out.println("Byte Default value "+b);
		System.out.println("short Default value "+s);
		System.out.println("int Default value "+i);
		System.out.println("long Default value "+l);
		
		System.out.println("float Default value "+DefaultValues.f);
		System.out.println("double Default value "+DefaultValues.d);
		
		System.out.println("char Default value "+c);
		System.out.println("boolean Default value "+bool);
		
		System.out.println("class Default value "+x);
		//System.out.println("Local variable Default value "+LV);
	}

}
