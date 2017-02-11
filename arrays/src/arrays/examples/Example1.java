package arrays.examples;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,30,40,50};
		
		Example1.changeIt(arr);
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	static void changeIt(int[] arr){
		int[]z=arr;
		z[0]=99;
	}

}
