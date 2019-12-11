import java.util.ArrayList;
import java.util.Random;

public class InterfaceController {
	
	
	
	public static void main(String args[]) {
		
		
			Random r = new Random();
		
		String currentUser = "";
		String lastNamer = "";
		String accN = String.format("%04d", r.nextInt(10000));
		//int accN = 
		float balanceS;
		float balanceC;
		//Person user = new Person(currentUser, lastNamer, accN, balanceS, balanceC);
		//user.chooseAccount();
		ArrayList<Float> acountNumbers = new ArrayList<Float>();
		
		System.out.println("Welcome to your ATM" + accN);
		
		
		
	}
	
public void chooseAccount(float accN) {
		
		System.out.println("Please choose an account:");
		
		int choose = 0;
		
		System.out.print("Press 1 for Checkings: ");
		
		System.out.print("Press 2 for Savings: ");
		
		System.out.print("Press 3 to check the balance of both of your accounts: ");
		
		switch(choose) {
		
		case 1:
			//call checkings
			//update balanceC
			break;
		case 2:
			//call savings
			//update balance
			break;
		case 3:
			//return both balances
			System.out.println("You have $" + balanceS + " in your Savings Account.");
			System.out.println("You have $" + balanceC + " in your Checkings Account.");
			
			break;
		default:
			System.out.println("Invalid selection");
			chooseAccount(accN);
			
				
		}
	
	
	
	
	
	
	


}
