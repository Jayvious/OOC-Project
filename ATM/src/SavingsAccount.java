package ATM.src;

import java.util.Scanner;

public class SavingsAccount {
	public Scanner input = new Scanner(System.in);
	public float balanceS = 0;
	static int choice;
	
	/*public void main(String args[]) {
		input = new Scanner(System.in);
		sTransaction(c);
	}*/
	
	public float sTransaction(User cUser) {
		int option = 0;
		
		balanceS = cUser.balanceS;
		
		System.out.println("Welcome to your SAVINGS account");
		System.out.println("Press a command key to select your action");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check Balance");
	
	option = input.nextInt();

	switch (option) {
	
		case 1:
			float depositS;
			System.out.println("Please enter an amount you wish to deposit: ");
			depositS = input.nextFloat();
			balanceS = balanceS + depositS;
			cUser.balanceS = balanceS;
			System.out.println("You deposited $" + depositS + ". Your new balance is $" + balanceS);
			newTransactionS(cUser);
		break;
		
		case 2:
			float amount;
			System.out.println("Please enter an amount you wish to withdraw");
			amount = input.nextFloat();
			if(amount > balanceS || amount == 0) {
			System.out.println("Error, you don't have that much money in the account to withdraw from");
			} else {
				balanceS = balanceS - amount;
				cUser.balanceS = balanceS;
				System.out.println("You have withdrawn $"+ amount + ". Your new balance is $"+ balanceS);
				newTransactionS(cUser);
			}
				
		break;
		
		case 3:
			System.out.println("You have a balance of $" + balanceS);
			newTransactionS(cUser);
			break;
			
		default:
			System.out.println("Invalid option! Please use inputs 1, 2, or 3 \n");
			sTransaction(cUser);
	}
	
	cUser.balanceS = balanceS;
	return cUser.balanceS;
	
	}
	
	public void newTransactionS(User cUser) {
		System.out.println("Do you want to complete another transaction? \n Press 1 if yes \n Press 2 if you want to exit");
		choice = input.nextInt();
		if(choice == 1) {
			sTransaction(cUser);
		} else if(choice == 2) {
			System.out.println("Thank you for using this ATM, have a good day!");
		} else {
			System.out.println("Error, invalid choice \n");
			newTransactionS(cUser);
		}
		
		}
		
	
	}