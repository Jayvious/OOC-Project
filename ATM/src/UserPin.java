package ATM.src;


	import java.util.Scanner;
	import java.util.ArrayList;
	
	public class UserPin 
	{

		private static InterfaceController newScreen = new InterfaceController();
		private static User cUser;
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub

		
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Welcome to the bank");
		System.out.print("Enter Your First Name\n");
		String name = s.nextLine();
		System.out.print("Enter Your Account\n");
		String acc = s.nextLine();
		System.out.print("Enter Your Pin\n");
		String pin = s.nextLine();
		
		ArrayList<User> currentUser = cUser.importFile("C:\\Users\\jiw25\\Downloads\\OOC-Project-master.zip\\OOC-Project-master\\ATM");
		
		
		/*while (entry != pinNumber )
		{
		
		System.out.println("\\nINCORRECT PIN. TRY AGAIN.");
		System.out.print("ENTER YOUR PIN:");
		entry = s.nextInt();
		}
		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOU ACCOUNT.");
		
		}*/
		int pinInt = Integer.parseInt(pin);
		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOU ACCOUNT.");
		newScreen.chooseAccount(pinInt);
		
		}
	}



