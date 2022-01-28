package techno;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
	}

}
}