/*
 * Sum of even index array and 
 * sum of odd index array
 */
package arrays.examples;

public class Example13  {
	static String resulteve="",resultodd="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={"aaa","bbb","ccc","ddd","eee","fff"};
		
		for(int j=0;j<s.length;j++){
			if(j%2==0){
				resulteve+=s[j];
			}
			else{
				resultodd+=s[j];
			}
		}
		
			System.out.println("Even index sum "+resulteve);
			System.out.println("odd index sum "+resultodd);
		
	}

}
