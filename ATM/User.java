package ATM.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
	
	public String fName;
	public String accN;	
	public String pin;
	public float balanceS;
	public float balanceC;
	public CheckingAccount checkA;
	public SavingsAccount saveA;
	

	
	
	public User() {
		this.fName = "Jeff";
		this.accN = "890103";
		this.pin = "0000";
	}
	
	public User(String accountNumber, String pin, String balanceS, String balanceC) {
		
		/*	try {
			this.setFirstName(fName);
			this.setAccountNumber(accN);
			this.setPin(pin);
		} catch(Exception e) {
			this.fName = "Test";
			this.accN = "18879";
			this.pin = "0000";
		}*/
		
		this.accN = accountNumber;
		this.pin = pin;
		this.balanceS = Float.parseFloat(balanceS);
		this.balanceC = Float.parseFloat(balanceC);
		
		
	
	}
	
	//Account number
	public String getAccountNumber() {
		return this.accN;
	}
	public void setAccountNumber(String accN) throws Exception {
		if(accN.length() < 5 || accN.length() > 5) {
			throw new Exception("Account number is 5 digits");
		}
		this.accN = accN;
	}
	//last name
	public String getPin() {
		return this.pin;
	}
	public void setPin(String pin) throws Exception {
		if(pin==null || pin=="" || pin.length() < 4 || pin.length() > 4) {
			throw new Exception("Invalid pin number");
		}
		this.pin=pin;
	}
	public float getBalanceS() {
		
		return this.balanceS;
	}
	public float getBalanceC() {
		
		return this.balanceC;
	}

	
	public String toString() {
		String return_string = "";
		
		
		return_string += "Account Number: " + this.accN + "\n";
		return_string += "Pin: " + this.pin + "\n";
		return return_string;
	}
	
	
	/*public void setCheckingAccount(String aNum) {
		
		//Grab the checking account for the user depending on their aNum
		checkA = new CheckingAccount();
		checkA.balanceC = 100000;
		
		
	}*/
	
	/*public void setSavingAccount(String aNum) {
		//Grab the checking account for the user depending on their aNum
		saveA = new SavingsAccount();
		saveA.balanceS = 400;
	}*/
	
//import csv
	public ArrayList<User> importFile(String filepath) {
		ArrayList<User> userInfo = new ArrayList<User>();
	
		File file = new File(filepath);
		
		try {
			Scanner a = new Scanner(file);
	
			while (a.hasNextLine()) {
		
			
			String account="";
			String pin="";
			String balanceC="";
			String balanceS="";
			String row= a.nextLine();
			String[] breaks = row.split(",");
			
			try {
			
			account=breaks[0];
			pin=breaks[1];
			balanceC = breaks[2];
			balanceS = breaks[3];
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("account number, and pin");
				continue;
			}
			catch (NumberFormatException e) {
				System.out.println("account number is not a number");
				continue;
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}

		User person = new User(account, pin, balanceC, balanceS);
			userInfo.add(person);
			
		}
			a.close();
			
		}
		catch(FileNotFoundException e){
			System.out.print("this file is not found");
		}
		return userInfo;
	}
	
		
		
//export
	
	
	

}