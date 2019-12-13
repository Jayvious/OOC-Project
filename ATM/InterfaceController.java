package ATM.src;


import java.util.Scanner;

public class InterfaceController {
	
	
	private SavingsAccount savAcc = new SavingsAccount();
	private CheckingAccount cheAcc = new CheckingAccount();
	
public void chooseAccount(User cUser) {
		
		float balanceS;
		float balanceC;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please choose an account:");
		System.out.print("Press 1 for Checkings: ");
		
		System.out.print("Press 2 for Savings: ");
		
		System.out.print("Press 3 to check the balance of both of your accounts: ");
		
		
		int choose = s.nextInt();
	
		
		switch(choose) {
		
		case 1:
			//checkings
			cheAcc.cTransaction(cUser);
			
			break;
		case 2:
			//call savings
			savAcc.sTransaction(cUser);
			
			//update balance
			break;
		case 3:
			//return both balances
			//this only returns the balance before the manipulation of the accounts
			balanceS = cUser.balanceS;
			balanceC = cUser.balanceC;
			System.out.println("You have $" + balanceS + " in your Savings Account.");
			System.out.println("You have $" + balanceC + " in your Checkings Account.");
			
			break;
		default:
			System.out.println("Invalid selection");
			chooseAccount(cUser);
			
				
		}
	


	}
}
