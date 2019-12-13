package ATM.src;

import java.util.Scanner;

public class CheckingAccount {
	public Scanner input = new Scanner(System.in);

	public float balanceC = 0;
	static int choice;
	
	
	
	/*public void main(String args[]) {
		input = new Scanner(System.in);
		 
		cTransaction();
	}*/
	
	public float cTransaction(User cUser) {
		
		int option = 0;
		
		balanceC = cUser.balanceC;
		
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
			cUser.balanceC = balanceC;
			System.out.println("You deposited $" + depositC + ". Your new balance is $" + balanceC);
			newTransactionC(cUser);
		break;
		
		case 2:
			float amount;
			System.out.println("Please enter an amount you wish to withdraw");
			amount = input.nextFloat();
			if(amount > balanceC || amount == 0) {
			System.out.println("Error, you don't have that much money in the account to withdraw from");
			} else {
				balanceC = balanceC - amount;
				cUser.balanceC = balanceC;
				System.out.println("You have withdrawn $"+ amount + ". Your new balance is $"+ balanceC);
				newTransactionC(cUser);
			}
				
		break;
		
		case 3:
			System.out.println("You have a balance of $" + balanceC);
			newTransactionC(cUser);
			break;
			
		default:
			System.out.println("Invalid option! Please use inputs 1, 2, or 3 \n");
			cTransaction(cUser);
	}
	cUser.balanceC = balanceC;
	return cUser.balanceC;
	}
	
	public void newTransactionC(User cUser) {
		System.out.println("Do you want to complete another transaction? \n Press 1 if yes \n Press 2 if you want to exit");
		choice = input.nextInt();
		if(choice == 1) {
			cTransaction(cUser);
		} else if(choice == 2) {
			System.out.println("Thank you for using this ATM, have a good day!");
		} else {
			System.out.println("Error, invalid choice \n");
			newTransactionC(cUser);
		}
	}{
	
	
	
	}
}







