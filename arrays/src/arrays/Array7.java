/*
 * Array with default values and null pointer exeception
 * 
 */
package arrays;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x=new int[3];
		System.out.println(x);
		System.out.println(x[0]);
		
		System.out.println("******");
		int[][] y=new int[2][3];
		System.out.println(y);
		System.out.println(y[0]);
		System.out.println(y[0][0]);
		
		System.out.println("******");
		int[][] z=new int[2][];
		System.out.println(z);
		System.out.println(z[0]);
		System.out.println(z[0][0]);
		
	}

}
