package Employee;

public abstract class Employee implements Payable {
	
	String firstName;
	String lastName;
	String SocialSecurityNumber;
	
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
	public String getSocialSecurityNumber() {
		return SocialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		SocialSecurityNumber = socialSecurityNumber;
	}
	
	public double getPaymentAmount() {
		return 0;
	}
       
}
