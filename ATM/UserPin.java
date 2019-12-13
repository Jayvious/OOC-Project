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

		ArrayList<User> userList = cUser.importFile("C:\\Users\\jiw25\\eclipse-workspace\\ATM\\UsersPin3.csv");
		
		String pin = "";
		Scanner s = new Scanner (System.in);
		int rUser = 0;
		System.out.println("Welcome to the bank");
		//System.out.print("Enter Your First Name\n");
		//String name = s.nextLine();
		System.out.print("Enter Your Account\n");
		String acc = s.nextLine();
		if(acc!=null && acc!="") {
			for (int i=0;i<userList.size();i++) {
				if(acc==null || acc == "") break;
				if (acc.equals(userList.get(i).accN)) {
					System.out.print("Enter Your Pin\n");
					 pin = s.nextLine();
					 
					if(pin.equals(userList.get(i).pin)) {
						rUser = i;
						break;
					}else {
						System.out.println("Your Account/Pin was wrong! Have a Nice Day.");
						System.exit(0);
					}
				}
			}
		}
			
			
		
		//System.out.print("Enter Your Pin\n");
		//String pin = s.nextLine();
		
		//System.out.print("Enter Your Savings Balance\n");
		String balanceS;
		
		//System.out.print("Enter Your Checkings Balance\n");
		String balanceC;
			
		if((pin == null || pin == "" )|| ( acc == null || acc == "")) {
			System.out.println("No Account/Pin was put in");
			System.exit(0);
		}
		balanceC = Float.toString(userList.get(rUser).balanceC);
		balanceS = Float.toString(userList.get(rUser).balanceS);
		
		
		cUser = new User( acc, pin, balanceC, balanceS);

		//System.out.println(cUser.toString());
		
		
		userList.add(cUser);
		//System.out.println(userList.toString());
		
		/*while (entry != pinNumber )
		{
		
		System.out.println("\\nINCORRECT PIN. TRY AGAIN.");
		System.out.print("ENTER YOUR PIN:");
		entry = s.nextInt();
		}
		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOU ACCOUNT.");
		
		}*/
		//System.out.println(cUser.balanceC);
		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOU ACCOUNT.");
		
		newScreen.chooseAccount(cUser);
		
		}
	}



