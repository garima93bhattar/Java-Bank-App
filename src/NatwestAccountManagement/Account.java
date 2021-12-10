package NatwestAccountManagement;

import java.util.Date;

public class Account {
	
	private long accountNumber;
	private double accountBal;
	private Category accountType;
	private int CustID;
	private Date dateOpened;
	
	public Account(long accountNumber, double accountBal, Category accountType, int custID, Date dateOpened) {
		super();
		this.accountNumber = accountNumber;
		this.accountBal = accountBal;
		this.accountType = accountType;
		CustID = custID;
		this.dateOpened = dateOpened;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBal() {
		return accountBal;
	}

	public void setAccountBal(double accountBal) {
		this.accountBal = accountBal;
	}

	public Category getAccountType() {
		return accountType;
	}

	public void setAccountType(Category accountType) {
		this.accountType = accountType;
	}

	public int getCustID() {
		return CustID;
	}

	public void setCustID(int custID) {
		CustID = custID;
	}

	public Date getDateOpened() {
		return dateOpened;
	}

	public void setDateOpened(Date dateOpened) {
		this.dateOpened = dateOpened;
	}
	
	public long generateAccount() {
		String accountNumber = "";
		for (int i = 0; i < 10; i++) {
			int randomnumber = (int)((Math.random() * (9 - 0)) + 0);
			accountNumber += randomnumber;
		}
		long finalaccountnumber = Long.parseLong(accountNumber);
		return finalaccountnumber;

	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountBal=" + accountBal + ", accountType=" + accountType
				+ ", CustID=" + CustID + ", dateOpened=" + dateOpened + "]";
	}

		

	
	
}
