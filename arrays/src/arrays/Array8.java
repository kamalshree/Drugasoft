/*
 * Array Index out of bound Exception
 */
package arrays;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] x=new int[2]; //range is 0 to 1
			x[0]=1;
			x[1]=2;
			//x[2]=3;// array index out of bound
			//x[-1]=10;// no complie time error but array 
					 //index out bound exception
	}

}
