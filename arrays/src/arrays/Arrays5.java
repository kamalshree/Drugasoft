/*
 * Scenarios of single dimension array
 * 
 */
package arrays;

public class Arrays5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
		int[] a=new int[0];
		//int[] b=new int[-3];
		//at compile time it need to check if it is a integer value
		//or not and hence it compiles
		//at run time memory allocation with -ve value throws
		//negative array size exception.
		
		int[] c=new int['a'];
		System.out.println(c.length);
	}

}
