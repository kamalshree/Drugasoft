/*
 * Find the greatest number in a array
 * 
 */
package arrays.examples;

import java.util.Arrays;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={50,30,40,20,100};
		int temp=0;
		Arrays.sort(arr);
	
		for(int aa:arr){
			System.out.println(aa);
		}
		
		for(int i=0;i<arr.length;i++){
		
			if(arr[i]>temp){
				temp=arr[i];
			}
		
		}
		System.out.println("greater values is "+temp);
	}

}
