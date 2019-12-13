package ATM.src;


	import java.util.Scanner;
	import java.util.ArrayList;
	
	public class UserPin 
	{

		public static InterfaceController newScreen = new InterfaceController();
		public static User cUser  = new User();
		public static void main(String[] args) throws Exception 
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
		
		System.out.print("Enter Your Savings Balance\n");
		String balanceS = s.nextLine();
		
		System.out.print("Enter Your Checkings Balance\n");
		String balanceC = s.nextLine();
		
		cUser = new User(name, acc, pin, balanceS, balanceC);

		System.out.println(cUser.toString());
		
		ArrayList<User> userList = cUser.importFile("C:\\Users\\jiw25\\eclipse-workspace\\ATM\\UsersPin.csv");
		userList.add(cUser);
		System.out.println(userList.toString());
		
		/*while (entry != pinNumber )
		{
		
		System.out.println("\\nINCORRECT PIN. TRY AGAIN.");
		System.out.print("ENTER YOUR PIN:");
		entry = s.nextInt();
		}
		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOU ACCOUNT.");
		
		}*/
		
		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOU ACCOUNT.");
		
		newScreen.chooseAccount(cUser);
		
		}
	}



