/*
 * length of the two dimensional array
 */
package arrays;

public class Array13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] x=new int[6][3];
		System.out.println(x.length);
		System.out.println(x[0].length);
		System.out.println(x[2].length);
		System.out.println(x);
		
		
		int[][] y= new int[2][];
		System.out.println(y.length);
		//System.out.println(y[0].length+y[1].length);null pointerexception
	}

}
