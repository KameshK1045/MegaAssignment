package Employee;

public class BasePlusCommisionEmployee extends CommisionEmployee{
    
	double baseSalary;

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
    public double getPaymentAmount() {
    	return baseSalary + (grossSales * commisionRate) ;
    }
}
