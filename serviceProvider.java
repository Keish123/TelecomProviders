package phoneCard;

public abstract class serviceProvider {
protected int companyID ;
protected String address ;
protected static int numCust ;
protected Customer customer ;

	public serviceProvider(int companyID, String address, int numCust) {
	super();
	this.companyID = companyID;
	this.address = address;
	this.numCust = numCust;
}

	public int getCompanyID() {
		return companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumCust() {
		return numCust;
	}

	//public void setNumCust(int numCust) {
		//this.numCust = numCust;
	//}

	public void addCust() {
		numCust++;
	
	}
	public void viewCust() {
		
		
	}
}
