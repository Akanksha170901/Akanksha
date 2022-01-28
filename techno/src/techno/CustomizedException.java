package techno;
import java.util.Scanner;
public class CustomizedException {

	public static void main(String[] args) 
	{
	int attendance;
	System.out.println("Enter Your attendance %");
	Scanner s=new Scanner(System.in);
	attendance=s.nextInt();
	
	if (attendance<75)
	{
	   throw new NotEligible("you can not apply for scholarship");

	}
	else
	{ 
		System.out.println("you can apply just go for it");
		
	}
 }
}
class NotEligible extends RuntimeException
{
	NotEligible (String msg)
	{
		super(msg);
	}
}
