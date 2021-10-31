package phoneCard;

public class Customer {
	private String lastName ;
	private String trn ;
	private String address ;
	private int creditBalance ; //not on the UML //
	private String telephoneNumber ;
	
	public void addCredit(int  credit) { 
		creditBalance += credit ;
		
	}
	
	public int getCreditBalance() {
		return creditBalance;
	}

	public void setCreditBalance(int creditBalance) {
		this.creditBalance = creditBalance;
	}

	public 	String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTrn() {
		return trn;
	}

	public void setTrn(String trn) {
		this.trn = trn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

}
