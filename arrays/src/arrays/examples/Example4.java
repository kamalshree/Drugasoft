package arrays.examples;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5};
		
		Example4.changeIt(arr);
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	static void changeIt(int[] arr){
		arr[0]=arr[arr.length-1];
	}

}
