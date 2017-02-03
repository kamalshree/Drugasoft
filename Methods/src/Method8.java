/*
 * No this used inside static block
 *   but 
 *  static variable inside instance block with this keyword
 * 
 */
public class Method8 {

	int x=10;
    static int y=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method8 o2=new Method8();
		o2.m1(1,2);
		Method8.m2(100, 200);

	}
	public void m1(int x,int y){
		System.out.println("local variables x and y "+(x+y));
		System.out.println("instance variables x and y "+(this.x+this.y));
	}
	
	public static void m2(int x, int y){
		Method8 o1=new Method8();
		System.out.println("local variables x and y "+(x+y));
		System.out.println("instance variables x and y "+(o1.x+Method8.y));
	}
}
