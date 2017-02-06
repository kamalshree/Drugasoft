
public class constructor2 {
	
	public constructor2(){
		this(10);
		System.out.println("User defined constructor zero parameters");
		//new constructor2(10);//or 
		
	}
	public constructor2(int a){
		System.out.println("User defined constructor with one parameters");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor2 c1=new constructor2();
		//constructor2 c2=new constructor2(10);
	}

}
