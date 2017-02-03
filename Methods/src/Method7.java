/*
 * 
 * Local variable and Instance variables same name
 * IV accessed with this
 * LV accessed directly
 */
public class Method7 {
	
	public int x=100;
	public int y=200;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method7 obj1=new Method7();
		obj1.add(10, 20);
	}
	
	public void add(int x,int y){
		System.out.println("local variables x and y "+(x+y));
		System.out.println("instance variables x and y "+(this.x+this.y));
	}

}
