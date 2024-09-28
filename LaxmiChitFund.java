import java.util.*;

class LaxshmiChitFund
{
	static Scanner sc =new Scanner(System.in );
	static String user ;
	static long phone ;
	static String addr;
	static String type;
	static int pin;
	static double bal;
	static ArrayList<String> tran = new ArrayList<>();

	public static void main(String[] args) 
	{
		for (; ; ) 
		{
			System.out.println();
			System.out.println("** WELCOME ***");
			System.out.println("     Laxmi Chit Fund");
			System.out.println();
			System.out.println("1. New Account");
			System.out.println("2. Login");
			System.out.println("3. Exit ");
			System.out.println();
			System.out.print("Enter an option : ");
			int option = sc.nextInt();
			switch(option)
			{
			case 1: newAccount(); break;
			case 2: login(); break;
			case 3: System.exit(0);
			default : System.out.println("Wrong option entered !"); break;
			}
		}	
	}

	public static void newAccount() 
	{
		if(user!=null)
		{
			System.out.println();
			System.out.print("Account is already created ! plz login ");
			return;
		}
		System.out.println();
		System.out.println("Account Creation Module");
		System.out.println();
		System.out.print("Username : ");
		sc.nextLine();
		user = sc.nextLine();
		System.out.print("Phone number :");
		phone = sc.nextLong();
		System.out.print("Address : ");
		sc.nextLine();
		addr = sc.nextLine();
		System.out.print("Pin : ");
		pin = sc.nextInt();
		System.out.print("Account Type : ");
		sc.nextLine();
		type = sc.next();
		System.out.print("Amount to be deposited : ");
		bal = sc.nextDouble();
		tran.add("Credited : "+bal);
		System.out.println();
		System.out.println("Account Created Successfully !");
	}

	public static void login() 
	{
		if(user==null)
		{
			System.out.println("Create your account first !");
			return;
		}

		System.out.println();
		System.out.println("** Login Module ***");
		System.out.println();
		System.out.print("Username : ");
		sc.nextLine();
		String user1 = sc.nextLine();
		System.out.print("Pin : ");
		int pin1 = sc.nextInt();
		if(user1.equals(user) && pin1==pin)
		{
			features();
		}
		else
		{
			System.out.println();
			System.out.print("Wrong Cred !!");
			System.out.println();
		}
	}

	public static void features() 
	{
		for (; ; ) 
		{
			System.out.println();
			System.out.println("** Features **");
			System.out.println();
			System.out.println("1. Deposit Amount");	
			System.out.println("2. Debit Amount");	
			System.out.println("3. Transfer Amount");	
			System.out.println("4. Check Balance");	
			System.out.println("5. Transaction History");	
			System.out.println("6. Loan & More");	
			System.out.println("7. Edit Account");	
			System.out.println("8. Logout");	
			System.out.println();
			int option = sc.nextInt();
			switch (option) 
			{
			case 1: depositAmount(); break;
			case 2: debitAmount(); break;
			case 3: transferAmount(); break;
			case 4: checkBalance(); break;
			case 5: statements(); break;
			case 6: loan(); break;
			case 7: editAccount(); break;
			case 8: System.exit(0);
			default : System.out.println("Wrong Option entered !");
			}
		}	

	}

	public static void depositAmount() 
	{
		System.out.println();
		System.out.println("Deposit Section");
		System.out.println();
		System.out.print("Enter an amount : ");
		double deposit = sc.nextDouble();
		bal = bal+deposit;
		tran.add("Credited : "+ deposit);
		System.out.println("Amount deposited");
	}

	public static void debitAmount() 
	{
		System.out.println();
		System.out.println("Debit Section");
		System.out.println();
		System.out.print("Enter an amount : ");
		double debit = sc.nextDouble();
		System.out.print("Enter your pin : ");
		int pin1 = sc.nextInt();
		if(pin1 ==pin)
		{
			if(debit<=bal)
			{
				bal = bal-debit;
				tran.add("Debited : "+ debit);
				System.out.println("Amount debited");
			}
			else
			{
				System.out.println();
				System.out.println("Insuffiecent Balance");
			}
		}
		else
		{
			System.out.println();
			System.out.println("Wrong pin entered");
		}
		
	}

	public static void transferAmount() 
	{
		System.out.println();
		System.out.println("Amount Transfer Section");
		System.out.println();
		System.out.print("Enter Receiver's Username : ");
		sc.nextLine();
		String recUser = sc.nextLine();
		System.out.print("Enter Receiver's Account No : ");
		long accNo = sc.nextLong();
		System.out.print("Enter transfer amount : ");
		double transferAmount = sc.nextDouble();
		System.out.print("Enter your pin : ");
		int pin1 = sc.nextInt();
		if (pin1 == pin) 
		{
			bal = bal-transferAmount;
			tran.add("Transfered : "+ transferAmount);
			System.out.println("Amount Transfered ");
		}
		else
		{
			System.out.println();
			System.out.println("Wrong pin entered ");
		}
		
	}

	public static void checkBalance() 
	{
		System.out.println();
		System.out.println("Check Balance");
		System.out.println();
		System.out.print("Enter your pin : ");
		int pin1 = sc.nextInt();
		if(pin == pin1)
		{
			System.out.println();
			System.out.println("Your Account Balance is "+ bal+ " rs");
		}
		else
		{
			System.out.println();
			System.out.println("Wrong Pin entered !");
		}
	}

	public static void statements() 
	{
		System.out.println();
		System.out.println("** Statements **");
		System.out.println();	
		for (String i : tran ) {
			System.out.println(i);
		}
	}

	public static void loan() {
	    System.out.println();
	    System.out.println("** Loan Section **");
	    System.out.println();

	    System.out.println("Select loan type:");
	    System.out.println("1. Personal Loan");
	    System.out.println("2. Home Loan");
	    System.out.println("3. Car Loan");
	    System.out.println("4. Education Loan");
	    System.out.println("5. Business Loan");
	    System.out.println("6. Gold Loan");
	    System.out.println("7. Mortgage Loan");

	    System.out.print("Enter your choice (1-7): ");
	    int loanTypeChoice = sc.nextInt();

	    String loanType = "";
	    double interestRate = 0;
	    int minTenure = 0;
	    int maxTenure = 0;

	    switch (loanTypeChoice) {
	        case 1:
	            loanType = "Personal Loan";
	            interestRate = 12; 
	            minTenure = 1;
	            maxTenure = 5;
	            break;
	        case 2:
	            loanType = "Home Loan";
	            interestRate = 9; 
	            minTenure = 5;
	            maxTenure = 30;
	            break;
	        case 3:
	            loanType = "Car Loan";
	            interestRate = 10; 
	            minTenure = 1;
	            maxTenure = 7;
	            break;
	        case 4:
	            loanType = "Education Loan";
	            interestRate = 8; 
	            minTenure = 3;
	            maxTenure = 15;
	            break;
	        case 5:
	            loanType = "Business Loan";
	            interestRate = 14; 
	            minTenure = 1;
	            maxTenure = 10;
	            break;
	        case 6:
	            loanType = "Gold Loan";
	            interestRate = 15; 
	            minTenure = 6;
	            maxTenure = 12;
	            break;
	        case 7:
	            loanType = "Mortgage Loan";
	            interestRate = 7; 
	            minTenure = 5;
	            maxTenure = 30;
	            break;
	        default:
	            System.out.println("Invalid choice.");
	            return;
	    }

	    System.out.print("Enter loan amount: ");
	    double loanAmount = sc.nextDouble();

	    System.out.print("Enter loan tenure (years): ");
	    int loanTenure = sc.nextInt();

	    if (loanTenure < minTenure || loanTenure > maxTenure) {
	        System.out.println("Loan tenure should be between " + minTenure + " and " + maxTenure + " years.");
	        return;
	    }

	    System.out.print("Enter credit score: ");
	    int creditScore = sc.nextInt();

	    if (creditScore < 650) { 
	        System.out.println("Loan rejected due to low credit score.");
	        return;
	    }

	    System.out.print("Enter your pin: ");
	    int pin1 = sc.nextInt();

	    if (!pinCheck(pin1)) {
	        System.out.println("Wrong pin entered.");
	        return;
	    }

	    double monthlyEMI = calculateEMI(loanAmount, loanTenure, interestRate);
	    double totalInterest = calculateTotalInterest(loanAmount, loanTenure, interestRate);

	    System.out.println();
	    System.out.println("Loan Details:");
	    System.out.println("Loan Type: " + loanType);
	    System.out.println("Loan Amount: " + loanAmount);
	    System.out.println("Loan Tenure: " + loanTenure + " years");
	    System.out.println("Monthly EMI: " + monthlyEMI);
	    System.out.println("Total Interest: " + totalInterest);

	    System.out.print("Confirm loan (yes/no): ");
	    sc.nextLine(); 
	    String confirmation = sc.nextLine();

	    if (confirmation.equalsIgnoreCase("yes")) {
	        bal -= loanAmount; 
	        tran.add("Loan: " + loanAmount);
	        System.out.println("Loan sanctioned successfully!");
	    } else {
	        System.out.println("Loan cancelled.");
	    }
	}

	public static double calculateEMI(double loanAmount, int loanTenure, double interestRate) {
	    double monthlyInterestRate = interestRate / 1200; 
	    int months = loanTenure * 12;
	    double emi = loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, months) / (Math.pow(1 + monthlyInterestRate, months) - 1);
	    return emi;
	}

	public static double calculateTotalInterest(double loanAmount, int loanTenure, double interestRate) 
	{
	    double monthlyInterestRate = interestRate / 1200; 
	    int months = loanTenure * 12;
	    double totalInterest = loanAmount * monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, months) - 1) / monthlyInterestRate;
	    return totalInterest;
	}


	public static void editAccount() 
	{
		System.out.println();
		System.out.println("Edit Account Section");
		System.out.println();
		System.out.println("1. Change Username");	
		System.out.println("2. Change Phone Number");	
		System.out.println("3. Change Address");	
		System.out.println("4. Change Pin");
		System.out.println();
		System.out.print("Enter an option : ");
		int option = sc.nextInt();
		switch (option) 
		{
			case 1: 
				System.out.println();
				System.out.println("Enter New Username : ");
				sc.nextLine();
				String user1 = sc.nextLine();
				System.out.print("Enter pin : ");
				int pin1 = sc.nextInt();
				if(pinCheck(pin1))
				{
					user = user1;
					System.out.println("Username Updated successfully !");
				}
				else 
					System.out.println("Wrong pin entered !");
				break;

			case 2: 
				System.out.println();
				System.out.println("Enter New Phone Number : ");
				long newNo = sc.nextLong();
				System.out.print("Enter pin : ");
				int pin2 = sc.nextInt();
				if(pinCheck(pin2))
				{
					phone = newNo;
					System.out.println("Phone Number updated successfully !");
				}
				else 
					System.out.println("Wrong pin entered !");
				break;

			case 3: 
				System.out.println();
				System.out.println("Enter New Address : ");
				sc.nextLine();
				String addr1 = sc.nextLine();
				System.out.print("Enter pin : ");
				int pin3 = sc.nextInt();
				if(pinCheck(pin3))
				{
					addr = addr1;
					System.out.println("Address updated successfully !");
				}
				else 
					System.out.println("Wrong pin entered !");
				break;

			case 4: 
				System.out.println();
				System.out.println("Enter New Pin : ");
				int newPin = sc.nextInt();
				System.out.print("Enter Current pin : ");
				int cpin = sc.nextInt();
				if(pinCheck(cpin))
				{
					pin = newPin;
					System.out.println("Pin updated successfully !");
				}
				else 
					System.out.println("Wrong pin entered !");
				break;

			default : System.out.println("Wrong option entered !"); break;
		}	
	}

	public static boolean pinCheck(int pin1) 
	{
		if(pin1 == pin)
			return true;
		else
			return false;	
	}
}











