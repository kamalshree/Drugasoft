package arrays.examples;


class Emp{
	
}
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp[] e=new Emp[3];// User defined array
		
		for(int i=0;i<e.length;i++){
			e[i]=new Emp();
		}
		
		for(Emp ee:e){
			System.out.println(ee);
		}
	}

}
