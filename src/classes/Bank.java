package classes;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	int custNo;
	String custName;
	String LoanNo;
	public List<Bank> customer = new ArrayList<Bank>();
	
	public Bank() {}
	Bank(int custNo, String custName, String loanNo) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		LoanNo = loanNo;
	}


	public int getCustNo() {
		return custNo;
	}


	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public String getLoanNo() {
		return LoanNo;
	}


	public void setLoanNo(String loanNo) {
		LoanNo = loanNo;
	}
	
	public void customerDetails() {
		
		customer.add(new Bank(876987,"Aarthi","9876543211234567890"));
		customer.add(new Bank(976597,"Avinash","9876543211234567891"));
		customer.add(new Bank(876523,"Abinaya","9876543211234567892"));
		
	}
	
	
}
