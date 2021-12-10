package NatwestAccountManagement;

import java.util.Date;
import java.util.*;

public class Transaction extends Account {
	
	private long TransferAmount = 0;
	private double amount;
	private long accountNumber;
	private Date dateTime;
	
	
	public Transaction(long accountNumber, double accountBal, Category accountType, int custID, Date dateOpened,
			double amount, long accountNumber2, Date dateTime) {
		super(accountNumber, accountBal, accountType, custID, dateOpened);
		this.amount = amount;
		accountNumber = accountNumber2;
		this.dateTime = dateTime;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public Date getDateTime() {
		return dateTime;
	}


	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	
	public String withdraw(double w)
    {
        if(getAmount()<w)
        {
            System.out.println("Sorry!!! Noy enough balance");
            return "Failure";
        }
        else
        {
            System.out.println("Balance amount after withdraw: "+(getAccountBal()-w));
            return "Success";
        }
    }
	
	public String deposit(double w)
    {
        if(getAmount()<0)
        {
            System.out.println("Sorry, cant deposit negative amount");
            return "Failure";
        }
        else
        {
            System.out.println("Balance amount after deposit: "+(getAccountBal()+w));
            return "Success";
        }
    }
	
	public long TransferAmount(double amount, Account a1 , Account a2 )
    {
        ((Transaction) a1).withdraw(amount);
        ((Transaction) a2).deposit(amount);
		return accountNumber;
	
    }
	
	@Override
	public String toString() {
		return "Transaction [amount=" + amount + ", accountNumber=" + accountNumber + ", dateTime=" + dateTime + "]";
	}
	
	public static void main(String[] args)
	
	
    {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to NatWest Banking");
		
		System.out.println("Do u want to Banking with us?");
		
		String string1 = sc.nextLine();
		
			
		System.out.println("Enter Ur account Details in, Separator as follows");

		System.out.println("First Name,LastName,Address,City,Phone Number,Joining Date");
		
		String string2 = sc.nextLine();
		
		System.out.println("Your Customer Details are: ");
		System.out.println();
		
		System.out.println("Select the Account type From Following\r\n"
				+ "1 Savings\r\n"
				+ "2 Salary");
		
		int int1= sc.nextInt();
		
		System.out.println("Enter the Initial Deposit Amount");
		 
          double amount = sc.nextInt();        
 
          try
          {
              if(amount < 0)
              {
                  throw new Exception();    
              }
          }
          catch(Exception ex)
          {
              System.out.println("Amount cant be negative");    
          }
          
          System.out.println("Your Account Details Are");
          System.out.println();
          
          System.out.println("Do u want to Create Account?");
          String string3 = sc.nextLine();
          
          System.out.println("Do u want to Perform Transaction?");
          String string4 = sc.nextLine();
          
          System.out.println("Select the Following Option\r\n"
          		+ "1. Deposit\r\n"
          		+ "2. Withdraw\r\n"
          		+ "3. Transfer");
          
          int int2= sc.nextInt();
          
/*          if (int2== 1)
        		  {deposit();
        		  }
          else if(int2==2)
          {withdraw();
          else if(int2==3)
          {
        	  TransferAmount();
          }
          }*/
    }
}


