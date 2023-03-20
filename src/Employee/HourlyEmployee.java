package Employee;

public class HourlyEmployee {

	double wage;
	double hours;
	
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public double getPaymentAmount() {
		return wage*hours;
	}
	
}
