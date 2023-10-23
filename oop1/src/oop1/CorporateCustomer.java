package oop1;

public class CorporateCustomer extends Customer {
	private String comnpanyName;
	private String taxNumber;

	public String getComnpanyName() {
		return comnpanyName;
	}

	public void setComnpanyName(String comnpanyName) {
		this.comnpanyName = comnpanyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

}
