package ATM.src;

import java.util.Scanner;

public class Userpin 
{

	private static InterfaceController newScreen = new InterfaceController();
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	
	
	Scanner s = new Scanner (System.in);
	
	System.out.println("Welcome to the bank");
	System.out.print("Enter Your Account\n");
	int entry = s.nextInt();
	System.out.print("Enter Your Pin\n");
	int pin = s.nextInt();
	
	
	
	
	/*while (entry != pinNumber )
	{
	
	System.out.println("\\nINCORRECT PIN. TRY AGAIN.");
	System.out.print("ENTER YOUR PIN:");
	entry = s.nextInt();
	}
	System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOU ACCOUNT.");
	
	}*/
	
	System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOU ACCOUNT.");
	newScreen.chooseAccount(pin);
	
	}
}



