package arrays.examples;

class Employee{
	public Employee(int id,String name){
		//System.out.println("Object created");
	}
	void display(){
		System.out.println("Record updated");
	}
}

public class Example8 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] e=new Employee[5];
		
		Employee e1=new Employee(111,"Jack");
		Employee e2=new Employee(222,"Jim");
		Employee e3=new Employee(333,"John");
		
		e[0]=e1;
		//e[1].display();//e1 is null and performs on null is null pointer exception
		e[2]=e2;
		//e[3].display();
		e[4]=e3;
		
		for(Object ee:e){
			
			if(ee instanceof Employee){
				((Employee) ee).display();
			}//object reference
		}
	}

}
