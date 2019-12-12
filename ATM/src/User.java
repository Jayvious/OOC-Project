package ATM.src;


public class User {
	
	//private String fName;
	//private String lName;
	private String accN;
	private float balanceS;
	private float balanceC;
	private CheckingAccount checkA;
	private SavingsAccount saveA;
	
	
	
	public User(String firstName, String lastName, String accountNumber) {
		
		//this.fName = firstName;
		//this.lName = lastName;
		this.accN = accountNumber;
		
	
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
	

	
		
		
	
	
	

}
