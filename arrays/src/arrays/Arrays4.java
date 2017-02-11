/*
 * 
 * Array Creations
 * get the className of primitive type array
 */
package arrays;

public class Arrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] b =new byte[3];
		System.out.println(b.getClass().getName());
		
		short[] s=new short[3];
		System.out.println(s.getClass().getName());
		
		int[] a=new int[5];
		System.out.println(a.getClass().getName());//retrieve the class name
		
		int[][] z=new int[5][5];
		System.out.println(z.getClass().getName());
		
		long[] l=new long[3];
		System.out.println(l.getClass().getName());
		
		float[] f=new float[3];
		System.out.println(f.getClass().getName());
		
		double[] d=new double[3];
		System.out.println(d.getClass().getName());
		
		char[] c=new char[5];
		System.out.println(c.getClass().getName());
		
		boolean[] bol=new boolean[5];
		System.out.println(bol.getClass().getName());
	}

}
