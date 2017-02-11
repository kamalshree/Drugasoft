package arrays.examples;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5};
		
		Example3.changeIt(arr);
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	static void changeIt(int[] arr){
		int temp=arr[arr.length-1];
		arr[0]=temp;
	}

}
