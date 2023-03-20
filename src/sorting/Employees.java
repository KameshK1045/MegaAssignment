package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Employees {

	int employeeId;
	String employeeName;
	String yearOfJoining;
	int rank;
	int age;
	int salary;
	String destination;
	public List<Employees> employee = new ArrayList<Employees>();
	
	 public Employees(){}
	
	 Employees(int employeeId, String employeeName, String yearOfJoining, int rank, int age, int salary,
			String destination) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.yearOfJoining = yearOfJoining;
		this.rank = rank;
		this.age = age;
		this.salary = salary;
		this.destination = destination;
	}

	
	public void getEmployeeDetails(int a) {
		
		employee.add(new Employees(986,"ABC","2000",1,45,50000,"Manager"));
		employee.add(new Employees(1456,"DEF","2005",2,40,45000,"Asst.Manager"));
		employee.add(new Employees(2345,"GHI","2009",3,35,40000,"Architect"));
		employee.add(new Employees(3456,"JKL","2012",4,30,35000,"Lead"));
		employee.add(new Employees(4567,"MNO","2015",5,25,30000,"Developer"));
		
		 if(a==1) {Collections.sort(employee,new comparable());}
		 else if(a==2) {Collections.sort(employee,new comb());}
		 else if(a==3) {Collections.sort(employee,new compared());}
		
	}
	
	public String toString() {
		return "Employee Name : "+employeeName+" Employee Id : "+employeeId+" Year of Joining : "+yearOfJoining+" Rank : "+rank+" Age : "+age+" Salary : "+salary+" Destination : "+destination+"\n"; 
	}
	
}

class comparable implements Comparator<Employees>{

	@Override
	public int compare(Employees o1, Employees o2) {
		// TODO Auto-generated method stub
		return o1.salary-o2.salary;
	}
	
}

class comb implements Comparator<Employees>{

	@Override
	public int compare(Employees o1, Employees o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}
	
}

class compared implements Comparator<Employees>{

	@Override
	public int compare(Employees o1, Employees o2) {
		// TODO Auto-generated method stub
		return o2.rank-o1.rank;
	}
	
}
