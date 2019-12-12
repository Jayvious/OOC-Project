package ATM.src;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class InterfaceController {
	
	private float balanceS;
	private float balanceC;
	private SavingsAccount savAcc;
	private CheckingAccount cheAcc;
	
	/*public static void main(String args[]) {
		
		
		Random r = new Random();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Can I have your Account Number and 4 digit-PIN:");
		
		
		
		
		String accN = String.format("%04d", r.nextInt(10000));
		
		float balanceS = 0;
		float balanceC = 0;
		
		//Person user = new Person(currentUser, lastNamer, accN, balanceS, balanceC);
		//user.chooseAccount();
		ArrayList<Float> acountNumbers = new ArrayList<Float>();
		
		
		
		System.out.println("Welcome to your ATM" + accN);
		
		
		
		
		
	}*/
	
public void chooseAccount(float accN) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please choose an account:");
		System.out.print("Press 1 for Checkings: ");
		
		System.out.print("Press 2 for Savings: ");
		
		System.out.print("Press 3 to check the balance of both of your accounts: ");
		
		
		int choose = s.nextInt();
	
		
		switch(choose) {
		
		case 1:
			//checkings
			cheAcc.cTransaction();
			
			break;
		case 2:
			//call savings
			savAcc.sTransaction();
			
			//update balance
			break;
		case 3:
			//return both balances
			balanceS = savAcc.balanceS;
			balanceC = cheAcc.balanceC;
			System.out.println("You have $" + balanceS + " in your Savings Account.");
			System.out.println("You have $" + balanceC + " in your Checkings Account.");
			
			break;
		default:
			System.out.println("Invalid selection");
			chooseAccount(accN);
			
				
		}
	
	
	
	
	
	
	


	}
}
