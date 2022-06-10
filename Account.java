import java.util.Scanner;

public class Account {

	// Class Variables
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;

	// Class constructor
	Account(String cname, String cid) {
		customerName = cname;
		customerID = cid;
	}

	// Function for Depositing money
	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	// Function for withdrawing money
	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}

	// Function showing the previous transaction
	void getPreviousTransaction() {
	
	if (previousTransaction > 0) {
		System.out.println("Deposited:"+ previousTransaction);
	} else if (previousTransaction < 0) {
	System.out.println("Withdrawn: " + Math.abs(previousTransaction));
	} else {
	System.out.println("No transaction occurred");
	}
	}
	// Function calculating interest of current funds after a number of years
	void calculateInterest (int years){
	double interestRate = .0185;
	double newBalance = (balance * interestRate * years) + balance;
	System.out.println("The current interest rate is " + (100 * interestRate) + "%");
	System.out.println("After" + years + " years, you balance will be: " + newBalance);
	}
	
	
	//Function showing the main menu
	void showMenu(){
		   char option='\0';
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("Welcome,"+customerName + "!");
		   System.out.println("Your ID is: " + customerID);
		   System.out.println();
		   System.out.println("What would you like to do?");
		   System.out.println();
		   System.out.println("A. Check your balance");
		   System.out.println("B. Make a deposit");
		   System.out.println("C. Make a withdrawal");
		   System.out.println("D. View previous transaction");
		   System.out.println("E. Calculate your interest");
		   System.out.println("F. Exit");
		   do{
		       System.out.println();
		       System.out.println("Enter an option: ");
		       char option1=scanner.next().charAt(e);
}
}