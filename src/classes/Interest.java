package classes;

import java.util.ArrayList;
import java.util.List;

public class Interest {

	String planName;
	double interest;
	List<Interest>intere = new ArrayList<Interest>();
	
	public Interest() {}
	Interest(String planName, double interest) {
		super();
		this.planName = planName;
		this.interest = interest;
	}
	
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	
	public void intersetDetails() {
		intere.add(new Interest("SBI Home Loan Regular",12.5));
		intere.add(new Interest("SBI Privilage Home Loan",25));
		intere.add(new Interest("SBI Corporate Home Loan",17));
	}
	
}
