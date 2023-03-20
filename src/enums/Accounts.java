package enums;

public class Accounts {

	Account acc;
	double min;
	double curr;
	String date;
	String branch;
	
	public Accounts(){}
    Accounts(Account acc, double min, double curr, String date, String branch) {
		super();
		this.acc = acc;
		this.min = min;
		this.curr = curr;
		this.date = date;
		this.branch = branch;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min = min;
	}
	public double getCurr() {
		return curr;
	}
	public void setCurr(double curr) {
		this.curr = curr;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public void getDetails() {
		Accounts acc = new Accounts(Account.SAVING,10000,15000,"2/3/23","SNKL");
		Customer cust1 = new Customer("Kamesh","M","MTP","6385861046",acc);
		Accounts acc2 = new Accounts(Account.CREDIT,10000,15000,"2/3/23","SNKL");
		Customer cust2 = new Customer("Rohit","M","MUMBAI","6385861045",acc2);
		Accounts acc3 = new Accounts(Account.CHECKING_ACCOUNTS,10000,15000,"2/3/23","SNKL");
		Customer cust3 = new Customer("Jasprit","M","MUMBAI","6385861044",acc3);
		
		System.out.println(cust1.toString());
	}

}
