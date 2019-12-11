import java.util.Scanner;

public class CheckingAccount {
	public static Scanner input;
	public static float balanceC = 0;
	static int choice;
	
	public static void main(String args[]) {
		input = new Scanner(System.in);
		cTransaction();
	}
	
	public static void cTransaction() {
		
		int option;
		
		System.out.println("Welcome to your CHECKINGS account");
		System.out.println("Press a command key to select your action");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check Balance");
	
	option = input.nextInt();

	switch (option) {
	
		case 1:
			float depositC;
			System.out.println("Please enter an amount you wish to deposit: ");
			depositC = input.nextFloat();
			balanceC = balanceC + depositC;
			System.out.println("You deposited $" + depositC + ". Your new balance is $" + balanceC);
			newTransactionC();
		break;
		
		case 2:
			float amount;
			System.out.println("Please enter an amount you wish to withdraw");
			amount = input.nextFloat();
			if(amount > balanceC || amount == 0) {
			System.out.println("Error, you don't have that much money in the account to withdraw from");
			} else {
				balanceC = balanceC - amount;
				System.out.println("You have withdrawn $"+ amount + ". Your new balance is $"+ balanceC);
				newTransactionC();
			}
				
		break;
		
		case 3:
			System.out.println("You have a balance of $" + balanceC);
			newTransactionC();
			
		default:
			System.out.println("Invalid option! Please use inputs 1, 2, or 3 \n");
			cTransaction();
	}
	}
	
	public static void newTransactionC() {
		System.out.println("Do you want to complete another transaction? \n Press 1 if yes \n Press 2 if you want to exit");
		choice = input.nextInt();
		if(choice == 1) {
			cTransaction();
		} else if(choice == 2) {
			System.out.println("Thank you for using this ATM, have a good day!");
		} else {
			System.out.println("Error, invalid choice \n");
			newTransactionC();
		}
		}{
	
	return this.balanceC;
	
	}
}





