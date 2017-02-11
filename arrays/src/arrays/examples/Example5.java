package arrays.examples;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,3,4,2,8,9,0};
		int x=a[0];
		for(int i=0;i<=(a.length-1);i++){
			System.out.println("inside the loop");
			if(a[i]<x)
				x=a[i];
		}
		System.out.println(x);
	}

}
