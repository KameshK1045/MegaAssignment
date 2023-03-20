package enums;


public class Customer {

	String name;
	String gender;
	String address;
	String phoneNo;
	Accounts acc;
	
	public Customer(String name, String gender, String address, String phoneNo, Accounts acc) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phoneNo = phoneNo;
		this.acc = acc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
