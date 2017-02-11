package arrays.examples;

class members{
	
	int id;
	String name;
	public members(int id,String name){
		this.id =id;
		this.name=name;
	}
	
}
public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		members[] m=new members[5];
		
		m[1]=new members(111,"abc");
		m[3]=new members(333,"xyz");
		m[4]=new members(444,"klm");
		
		// null pointer exception out, m[0] and m[2] are
		// null and operation on null will lead to null pointer
		//exception
		/*for(members mm:m){
			System.out.println("id is "+mm.id+
					"Name is "+mm.name);
		}*/
		
		//This below loop will exclude the null value
		for(members mm:m){
		
			if(mm instanceof members){
				System.out.println("id is "+mm.id+
						"Name is "+mm.name);
			}
		}
		
		//Print the index of the null values
		for(int i=0;i<m.length;i++){
			
			if(!(m[i] instanceof members)){
				System.out.println("The index location is "+i);
			}
		}
	}


}
