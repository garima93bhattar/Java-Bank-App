package NatwestAccountManagement;

import java.util.Date;
import java.util.Random;

public class Customer {
	
	private int CustID;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private long phoneNumber;
	private Date dateTime;
	
	
	public Customer(int custID, String firstName, String lastName, String address, String city, long phoneNumber,
			Date dateTime) {
		super();
		CustID = custID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.phoneNumber = phoneNumber;
		dateTime = dateTime;
	}


	public int getCustID() {
		return CustID;
	}


	public void setCustID(int custID) {
		CustID = custID;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Date getDateTime() {
		return dateTime;
	}


	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	public static long GeneratorCustomer() {
		long randomId = 0;
		Random rand = new Random(); 
		 for (int j=0;j < 10;j++)
		 {   
		      randomId = rand.nextLong();  
		 } 
		return randomId; 
		}


	@Override
	public String toString() {
		return "Customer [CustID=" + CustID + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", city=" + city + ", phoneNumber=" + phoneNumber + ", DateTime=" + dateTime + "]";
	}
	
		
		
	
}
