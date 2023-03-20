package megaass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Mega {
     
	String catogary;
	String item;
	int price;
	List<Mega>products = new ArrayList<Mega>();
	List<Mega>products2 = new ArrayList<Mega>();
	Mega(){}
	Mega(String catogary,String item,int price){
		this.catogary = catogary;
		this.item = item;
		this.price = price;
	}
	
	public void productList() {
		
		products.add(new Mega("Stationary","Pen",16));
		products.add(new Mega("Stationary","Pencil",24));
		products.add(new Mega("Stationary","NoteBook",38));
		products.add(new Mega("Food","Milk",24));
		products.add(new Mega("Food","Vegetables",21));
		products.add(new Mega("Food","Fruits",27));
		
		products2.add(new Mega("Stationary","Pen",20));
		products2.add(new Mega("Food","Milk",24));
		products2.add(new Mega("Stationary","Pencil",50));
		products2.add(new Mega("Food","Vegetable",19));
		products2.add(new Mega("Food","Fruits",12));
		products2.add(new Mega("Stationary","NoteBook",21));
		
	}
	
	public String toString() {
		return "Catogary : "+catogary+" Item : "+item+" Price : "+price+"\n";
	}
}

class comparable implements Comparator<Mega>{

	@Override
	public int compare(Mega o1, Mega o2) {
		// TODO Auto-generated method stub
		return o1.price-o2.price;
	}
	
}

class comparables implements Comparator<Mega>{

	@Override
	public int compare(Mega o1, Mega o2) {
		// TODO Auto-generated method stub
		return -1*(o1.catogary.length()-o2.catogary.length());
	}
	
}


class Month{
	String month;
	int sales;
	int monthNo;
	public List<Month>months = new ArrayList<Month>();
	
	Month(){}
	Month(String month,int sales, int monthNo){
		this.month = month;
		this.sales = sales;
		this.monthNo = monthNo;
	}
	
	public void monthsSort() {
		
		months.add(new Month("April",5531,4));
		months.add(new Month("August",1531,8));
		months.add(new Month("December",9036,12));
		months.add(new Month("February",9940,2));
		months.add(new Month("January",6937,1));
		months.add(new Month("July",6325,7));
		months.add(new Month("June",1930,6));
		months.add(new Month("March",3036,3));
		months.add(new Month("May",5062,5));
		months.add(new Month("November",1686,11));
		months.add(new Month("October",2051,10));
		months.add(new Month("Sebtember",9041,9));
	}
	
	public String toString(){
		return "Month : " +month+" Sales : "+sales+"\n";
	}
}

class compa implements Comparator<Month>{

	@Override
	public int compare(Month o1, Month o2) {
		// TODO Auto-generated method stub
		return o1.monthNo-o2.monthNo;
	}
	
}