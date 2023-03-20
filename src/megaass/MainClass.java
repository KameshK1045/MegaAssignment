package megaass;

import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

import Employee.BasePlusCommisionEmployee;
import Employee.CommisionEmployee;
import Employee.Employee;
import Employee.HourlyEmployee;
import Employee.SalariedEmployee;
import calculator.BasicCalculator;
import calculator.DecimalCalculator;
import calculator.PercentageCalculator;
import classes.Bank;
import classes.Book;
import classes.Interest;
import classes.Page;
import classes.Plan;
import classes.Products;
import classes.Students;
import classes.Train;
import enums.Accounts;
import enums.CRUD;
import enums.Chess;
import enums.Coins;
import enums.Color;
import enums.Week;
import exceptions.Arith;
import mapExcercise.NumKeys;
import mapExcercise.Studentss;
import message.Cliq;
import message.Mail;
import message.Whatsapp;
import roombooking.Deluxe;
import roombooking.Economy;
import roombooking.SuperDeleuxe;
import sorting.Company;
import sorting.Employees;
import sorting.SortingNumber;

public class MainClass {
    
	int sum;
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Mega mega = new Mega();
		MainClass main = new MainClass();
		mega.productList();
		for(Mega m:mega.products) {
			main.sum+=m.price;
		}
		
		System.out.println("Sum of Products : "+main.sum+"\n");
		Collections.sort(mega.products,new comparable());
		System.out.println(mega.products.get(0));
		System.out.println(mega.products.get(mega.products.size()-1));
	    System.out.println("Average of the products :"+main.sum/mega.products.size());
	    System.out.println();
	    Collections.sort(mega.products2,new comparables());
	    System.out.println(mega.products2);
	    System.out.println();
				
	    Month mont = new Month();
	    mont.monthsSort();
	    Collections.sort(mont.months,new compa());
	
	    	for(Month m:mont.months) {
	    	    if(m.month.startsWith("Ma")) {
	    		System.out.println(m);
	    	}
	    	    
	    	    else if(m.month.contains("emb")) {
	    	    	System.out.println(m);
	    	    }
	    	    else if(m.month.endsWith("ary")) {
	    	    	System.out.println(m);
	    	    }
	    }
	    	System.out.println();
	    	
	    	System.out.println(mont.months);
	    	System.out.println();
	    	
	    	CommisionEmployee com = new CommisionEmployee();
	    	HourlyEmployee hour = new HourlyEmployee();
	    	SalariedEmployee sal = new SalariedEmployee();
	    	BasePlusCommisionEmployee bpce = new BasePlusCommisionEmployee();
	    	System.out.println("1.Commission Employee\n2.Hourly Employee\n3.Salaried Employee\n4.BasePlusCommissionEmployee");
	    	String opt = sc.nextLine();
	    	switch(opt) {
	    	case "1":
	    		System.out.println("Enter your gross Sales");
	    		double gross = sc.nextDouble();
	    		System.out.println("Enter your commission Rate");
	    		double commission = sc.nextDouble();
	    		com.setGrossSales(gross);
	    		com.setCommisionRate(commission);
	    		System.out.println(com.getPaymentAmount());
	    		break;
	    		
	    	case "2":
	    		System.out.println("Enter your wages");
	    		double wage = sc.nextDouble();
	    		System.out.println("Enter your Working Hours");
	    		double hours = sc.nextDouble();
	    		hour.setWage(wage);
	    		hour.setHours(hours);
	    		System.out.println(hour.getPaymentAmount());
	    		break;
	    		
	    	case "3":
				System.out.println("Enter your weekly salary");
				double week = sc.nextDouble();
				sal.setWeeklySalary(week);
				System.out.println(sal.getWeeklySalary());
				break;
				
	    	case "4":
	    		System.out.println("Enter your Base Salary");
	    		double base = sc.nextDouble();
	    		System.out.println("Enter your gross Sales");
	    		double grosses = sc.nextDouble();
	    		System.out.println("Enter your commission Rate");
	    		double commissions = sc.nextDouble();
	    		bpce.setBaseSalary(base);
	    		bpce.setGrossSales(grosses);
	    		bpce.setCommisionRate(commissions);
	    		System.out.println(bpce.getPaymentAmount());
	    		break;
	    		
	    		
	    	}
	    	
			
	    	BasicCalculator bc = new BasicCalculator();
	    	PercentageCalculator pc = new PercentageCalculator();
	    	DecimalCalculator dc = new DecimalCalculator();
	    	
	    	System.out.println("1.BasicCalculator\t2.PercentageCalculatror\t3.DecimalCalculator");
	    	int option = sc.nextInt();
	    	
	    	switch(option) {
	    	case 1:
	    		System.out.println("Enter the number");
	    		int num1 = sc.nextInt();
	    		System.out.println("Enter the number");
	    		int num2 = sc.nextInt();
	    		bc.setNum1(num1);
	    		bc.setNum2(num2);
	    		System.out.println("Sum of Two Numbers :"+bc.sumOfTwoNumbers()+"\nProduct of two numbers :"+bc.productOfTwoNumbers()+"\nDivision of two numbers :"+bc.divisionOfNumbers());
	    		break;
	    		
	    	case 2:
	    		System.out.println("Enter the number");
	    		int a = sc.nextInt();
	    		System.out.println("Enter the number");
	    		int b = sc.nextInt();
	    		pc.setNum1(a);
	    		pc.setNum2(b);
	    		System.out.println("Sum of Two Numbers :"+pc.sumOfTwoNumbers()+"\nProduct of two numbers :"+pc.productOfTwoNumbers()+"\nDivision of two numbers :"+pc.divisionOfNumbers());
	    		break;
	    		
	    	case 3:
	    		System.out.println("Enter the number");
	    		int c = sc.nextInt();
	    		System.out.println("Enter the number");
	    		int d = sc.nextInt();
	    		dc.setNum1(c);
	    		dc.setNum2(d);
	    		System.out.println("Sum of Two Numbers :"+pc.sumOfTwoNumbers()+"\nProduct of two numbers :"+pc.productOfTwoNumbers()+"\nDivision of two numbers :"+pc.divisionOfNumbers());
	    		break;
	    		
	    	}
	    	
	    	Whatsapp wa = new Whatsapp();
	    	Mail email = new Mail();
	    	Cliq cliq = new Cliq();
	    	
	    	System.out.println("1.Whatsapp\t2.Mail\t3.Cliq");
	    	int get = sc.nextInt();
	    	sc.nextLine();
	    	
	    	switch(get) {
	    	
	    	case 1:
	    		System.out.println("Enter your phone number");
	    		String number = sc.nextLine();
	    		System.out.println("Enter your text");
	    		String msg = sc.nextLine();
	    		wa.setPhoneNo(number);
	            wa.setMessage(msg);
	    		wa.fetchNecessaryInputs();
	    		break;
	    		
	    	case 2:
	    		System.out.println("Enter your mail id");
	    		String mailId = sc.nextLine();
	    		System.out.println("Enter another mail id");
	    		String to = sc.nextLine();
	    		System.out.println("Enter the subject");
	    		String sub = sc.nextLine();
	    		System.out.println("Enter your text");
	    		String msg2 = sc.nextLine();
	    		email.setFrom(mailId);
	    		email.setTo(to);
	    		email.setSubject(sub);
	    		email.setMessage(msg2);
	    		email.fetchNecessaryInputs();
	    		break;
	    		
	    	case 3:
	    		System.out.println("Enter mail id ");
	    		String name = sc.nextLine();
	    		System.out.println("Enter your text");
	    		String msg3 = sc.nextLine();
	    		cliq.setMail(name);
	    		cliq.setMessage(msg3);
	    		cliq.fetchNecessaryInputs();
	    		break;
	    	}
	    	
	    	Economy eco = new Economy();
	    	Deluxe del = new Deluxe();
	    	SuperDeleuxe sD = new SuperDeleuxe();
	    	System.out.println("1.Economy\t2.Deluxe\t3.SuperDeluxe");
	    	int e = sc.nextInt();
	    	
	    	switch(e) {
	    	case 1:eco.fetchNecessaryInputs();break;
	    	case 2:del.fetchNecessaryInputs();break;
	    	case 3:sD.fetchNecessaryInputs();break;
	    	}
	    	
	    	Chess che = new Chess();
	    	Coins coi = null;
	    	Color cols = null;
	    	
	    	
	    	System.out.println("Enter your Coin Name(Ex : KING,QUEEN,BISHOP,PAWN,ROOK,KNIGHT");
	    	String coin = sc.nextLine();
	    	System.out.println("Enter the color(Ex : WHITE,BLACK");
	    	String col = sc.nextLine();
	    	
	    	if(coin.equals("KING")) {coi = Coins.KING;}
	    	else if(coin.equals("QUEEN")) {coi = Coins.QUEEN;}
	    	else if(coin.equals("KNIGHT")) {coi = Coins.KNIGHT;}
	    	else if(coin.equals("BISHOP")) {coi = Coins.BISHOP;}
	    	else if(coin.equals("ROOK")) {coi = Coins.ROOK;}
	    	else if(coin.equals("PAWN")) {coi = Coins.PAWN;}
	    	
	    	if(col.equals("BLACK")) {cols = Color.BLACK;}
	    	if(col.equals("WHITE")) {cols = Color.WHITE;}
	    	
	    	che.setCoin(coi);
	    	che.setColor(cols);
	    	che.getCoins();
	    	
	    	for(Chess s:che.board) {
	    		if(s.getCoin()==coi && s.getColor()==cols) {
	    		System.out.println(s);
	    		}
	    	}
	    	
	    	Accounts acc = new Accounts();
	    	acc.getDetails();
	    	
	    	Date day = new Date();
	    	int days = day.getDay();
	    	System.out.println(days);
	    	Week week = null;
	    	switch(days) {
	    	case 0:
	    		week =Week.SUNDAY;
	    		System.out.println(week);
	    		break;
	    		
	    	case 1:
	    		week =Week.MONDAY;
	    		System.out.println(week);
	    		break;
	    		
	    	case 2:
	    		week =Week.TUESDAY;
	    		System.out.println(week);
	    		break;
	    		
	    	case 3:
	    		week =Week.WEDNESDAY;
	    		System.out.println(week);
	    		break;
	    		
	    	case 4:
	    		week =Week.THURSDAY;
	    		System.out.println(week);
	    		break;
	    		
	    	case 5:
	    		week =Week.FRIDAY;
	    		System.out.println(week);
	    		break;
	    		
	    	case 6:
	    		week =Week.SATURDAY;
	    		System.out.println(week);
	    		break;
	    	}
	    	
	    	System.out.println("Enter the method name (Create,Update,Read,Delete)");
	    	String method = sc.nextLine();
	    	 CRUD crud =CRUD.valueOf(method.toUpperCase());
	    
	    	
	    	System.out.println((crud == CRUD.CREATE || crud == CRUD.READ || crud == CRUD.UPDATE || crud == CRUD.DELETE)?true:false);
	    	
	    	Arith ari = new Arith();
	    	System.out.println("Enter the first number");
	    	int a = sc.nextInt();
	    	System.out.println("Enter the second number");
	    	int b = sc.nextInt();
	    	
	    	ari.setA(a);
	    	ari.setB(b);
	    	ari.arithmetic();
	    	
	    	ari.complete();
	    	ari.custom(a);
	    	ari.filefound();
	    	ari.nullExce();
	    	
	    	Book book = new Book();
	    	Page page = new Page();
	    	
	    	System.out.println("Enter the isbn number");
	    	int isbn = sc.nextInt();
	    	book.setIsbn(isbn);
	    	System.out.println("Enter the pages(1-5)");
	    	int pageNo = sc.nextInt();
	    	page.printPages(pageNo);
	    	
	    	Students stud = new Students();
	    	System.out.println("Enter the student id\n1.656321\t2.530522\t3.817402\t4.502020");
	    	int num = sc.nextInt();
	    	stud.studentsList(num);
	    	
	    	Products pro = new Products();
	    	System.out.println("Enter the product ID\n1.656321\t2.609992\t3.709772\t4.844808");
	    	int num2= sc.nextInt();
	    	pro.productDetails(num2);
	    	
	    	SortingNumber sorts = new SortingNumber();
	    	sorts.sortingMethods();
	    	
	    	Employees emp = new Employees();
	    	System.out.println("Enter the number\n1.Age\t2.Rank\t3.Salary");
	    	int empNum = sc.nextInt();
	        emp.getEmployeeDetails(empNum);
	        System.out.println(emp.employee);
	        
	        Company comp = new Company();
	        System.out.println("Enter the number\n1.Revenue\t2.Rank in app store\t3.Rank in hunt store");
	        int comNum = sc.nextInt();
	        comp.companyList(comNum);
	        System.out.println(comp.company);
	       
	        NumKeys numk = new NumKeys();
	        System.out.println("Enter the number (0-9)");
	        int numks = sc.nextInt();
	        numk.detailsAdd(numks);
	        sc.nextLine();
	        System.out.println("Enter the alphapets");
	        String alp = sc.nextLine();
	        numk.alphaAdd(alp);
	        numk.groupDetails();
	        System.out.println(numk.al);
	        System.out.println(numk.al2);
	        
	        Studentss stu = new Studentss();
	        System.out.println("Enter the group\n1.Computer Science\t2.Biology\t3.Commerce");
	        String optStu = sc.nextLine();
	        stu.studentDetails(optStu);
	        
	        numk.storeDetails();

	    	Bank bank = new Bank();
	    	Plan pla = new Plan();
	    	Interest inter = new Interest();
	    	bank.customerDetails();
	    	pla.loanDetails();
	    	inter.intersetDetails();
	    	double simple =0.0;
	    	System.out.println("Enter the A/C No\n1.9876543211234567890\t2.9876543211234567891\t3.9876543211234567892");
	    	String sim = sc.nextLine();
	    	if(sim.equals("9876543211234567890")) {
	    		System.out.println(bank.customer.get(0).getCustName());
	    		simple = (((pla.plan.get(0).getPrincipal() * 14 * 12.5)/100)/(14*12));
	    		System.out.println("Simple Interest of month :"+simple);
	    	}
	    	else if(sim.equals("9876543211234567891")) {
	    		System.out.println(bank.customer.get(1).getCustName());
	    		simple = (((pla.plan.get(0).getPrincipal() * 14 * 25)/100)/(14*12));
	    		System.out.println("Simple Interest of month :"+simple);
	    	}
	    	else if(sim.equals("9876543211234567892")) {
	    		System.out.println(bank.customer.get(2).getCustName());
	    		simple = (((pla.plan.get(0).getPrincipal() * 14 * 17)/100)/(14*12));
	    		System.out.println("Simple Interest of month :"+simple);
	    	}
	    	
	    	
	    	
	}
	}
	
	
	



