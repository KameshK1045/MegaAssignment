package Employee;

public class CommisionEmployee extends Employee {

	double grossSales;
	double commisionRate;
	
	
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommisionRate() {
		return commisionRate;
	}
	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}
	
	public double getPaymentAmount() {
		 return grossSales * commisionRate;
	}
	
}
