package ATM.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
	
	private String fName;
	private String accN;	
	private String pin;
	private float balanceS;
	private float balanceC;
	private CheckingAccount checkA;
	private SavingsAccount saveA;

	
	
	public User() {
		this.fName = "Test";
		this.accN = "890103";
		this.pin = "0000";
	}
	
	public User(String firstName, String accountNumber, String pin) {
		
		try {
			this.setFirstName(fName);
			this.setAccountNumber(accN);
			this.setPin(pin);
		} catch(Exception e) {
			this.fName = "Test";
			this.accN = "18879";
			this.pin = "0000";
		}
	
	}
	//first name
	/*public String getFirstName() {
		return this.fName;
	}*/
	public void setFirstName(String first) throws Exception {
		if(first==null || first=="") {
			throw new Exception("Invalid first name");
		}
		this.fName=first;
	}
	//Account number
	/*public String getAccountNumber() {
		return this.accN;
	}*/
	public void setAccountNumber(String accN) throws Exception {
		if(accN.length() < 5 || accN.length() > 5) {
			throw new Exception("Account number is 5 digits");
		}
		this.accN = accN;
	}
	//last name
	/*public String getPin() {
		return this.pin;
	}*/
	public void setPin(String pin) throws Exception {
		if(pin==null || pin=="" || pin.length() < 4 || pin.length() > 4) {
			throw new Exception("Invalid pin number");
		}
		this.pin=pin;
	}
	

	
	public String toString() {
		String return_string = "";
		
		return_string += "First Name: " + this.fName + "\n";
		return_string += "Account Number: " + this.accN + "\n";
		return_string += "Pin: " + this.pin + "\n";
		return return_string;
	}
	
	
	public void getCheckingAccount(String aNum) {
		
		//Grab the checking account for the user depeding on their aNum
		CheckingAccount cAcc = new CheckingAccount();
		cAcc = this.checkA;
		
	}
	
	public void getSavingAccount(String aNum) {
		//Grab the checking account for the user depeding on their aNum
		SavingsAccount sAcc = new SavingsAccount();
		sAcc = saveA;
	}
	
//import csv
	public static ArrayList<User> importFile(String filepath) {
		ArrayList<User> userInfo = new ArrayList<User>();
	
		File file = new File(filepath);
		
		try {
			Scanner a = new Scanner(file);
	
			while (a.hasNextLine()) {
		String first="";
			
			String account="";
			String pin="";
			String row= a.nextLine();
			String[] breaks = row.split(",");
			
			try {
			first=breaks[0];
			account=breaks[1];
			pin=breaks[2];
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("need first name, account number, and pin");
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

		User person = new User(first,account, pin);
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
	public static void exportFile(String filepath, ArrayList<User> userInfo) {
		File file = new File(filepath);
		try {
			FileWriter writer = new FileWriter(file);
			for(int b=0; b<userInfo.size();b++) {
				User temp= userInfo.get(b);
				writer.write(temp.fName + "," + temp.accN + "," + temp.pin +"/n");
				writer.flush();
			}
			writer.close();
		}
		catch(IOException e) {
			System.out.print("Can't write on file");
		}
	}
	
	

}