package classes;

import java.util.ArrayList;
import java.util.List;

public class Plan {
      
	String loanNo;
	String planName;
	int principal;
	public List<Plan> plan = new ArrayList<Plan>();
	
	public Plan() {}
	Plan(String loanNo, String planName, int principal) {
		super();
		this.loanNo = loanNo;
		this.planName = planName;
		this.principal = principal;
	}

	public String getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public int getPrincipal() {
		return principal;
	}

	public void setPrincipal(int principal) {
		this.principal = principal;
	}
	
	public void loanDetails() {
		plan.add(new Plan("9876543211234567890","SBI Home Loan Regular",1400000));
		plan.add(new Plan("9876543211234567891","SBI Privilage Home Loan",2700000));
		plan.add(new Plan("9876543211234567892","SBI Corporate Home Loan",2000000));
		
	}
	
	
	
}
