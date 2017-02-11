/*
 * 
 * Anonymous array
 */
package arrays;

public class Array14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(new int[]{10,20,30}));
		//nameless array/Anonymous array		
	}
	
	public static int sum(int[] arr){
		int total=0;
		for(int x1:arr){
			total+=x1;
		}
		return total;
	}

}
