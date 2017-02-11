/*
 * Inner Instance
 * 
 */
public class Instance2 {
	{
		System.out.println("main instance block");
		{
			System.out.println("inner instance block");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Instance2();
	}

}
