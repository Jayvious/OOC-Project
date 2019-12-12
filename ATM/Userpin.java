import java.util.Scanner;

public class Userpin 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	
	
	Scanner s = new Scanner (System.in);
	int pinNumber = 1234;
	System.out.println("Welcome to the bank");
	System.out.print("Enter Your Pin");
	int entry = s.nextInt();
	
	
	while (entry != pinNumber )
	{
	
	System.out.println("\\nINCORRECT PIN. TRY AGAIN.");
	System.out.print("ENTER YOUR PIN:");
	entry = s.nextInt();
	}
	System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOU ACCOUNT.");
	
	
}
}


