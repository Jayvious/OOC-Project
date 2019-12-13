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
			// We only had time to work on the cases we created in the csv file
			//For each account it has a pin number and account number
			//if the account number is in the csv we will access the users balance for Checking and savings accounts
			//They can then manipulate those accounts in their own separate class
			

		ArrayList<User> userList = cUser.importFile("C:\\Users\\jiw25\\eclipse-workspace\\ATM\\UsersPin3.csv");
		
		String pin = "";
		Scanner s = new Scanner (System.in);
		int rUser = 0;
		System.out.println("Welcome to the bank");
		
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
			
			
		
		
		String balanceS;
		
		
		String balanceC;
			
		if((pin == null || pin == "" )|| ( acc == null || acc == "")) {
			System.out.println("No Account/Pin was put in");
			System.exit(0);
		}
		balanceC = Float.toString(userList.get(rUser).balanceC);
		balanceS = Float.toString(userList.get(rUser).balanceS);
		
		
		cUser = new User( acc, pin, balanceC, balanceS);
		
		
		userList.add(cUser);
		
		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOU ACCOUNT.");
		
		newScreen.chooseAccount(cUser);
		
		}
	}



