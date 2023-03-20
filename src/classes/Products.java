package classes;

import java.util.ArrayList;
import java.util.List;

public class Products {

	int productID;
	String productName;
	int cost;
	int sell;
	int quantity;
	List<Products> product = new ArrayList<Products>();
	
	
	public Products() {};
	
	 Products(int productID, String productName, int cost, int sell, int quantity) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.cost = cost;
		this.sell = sell;
		this.quantity = quantity;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getSell() {
		return sell;
	}
	public void setSell(int sell) {
		this.sell = sell;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public void productDetails(int b) {
		
		product.add(new Products(656321,"Coffee cups",125,150,3));
		product.add(new Products(609992,"T-Shirts",100,300,3));
		product.add(new Products(709772,"Portable TV",5000,7000,1));
		product.add(new Products(844808,"Lenovo K9 Phone",9000,12000,1));
		
		int costArr[] = new int[product.size()];
		int sellArr[] = new int[product.size()];
		int costs;
		int sells;
		double profit;
		double profitArr[] = new double[product.size()];
		
		for(int i=0; i<product.size(); i++) {
			costs=0;
			costs+=(product.get(i).getCost())*product.get(i).getQuantity();
			costArr[i] = costs;
			
			sells=0;
			sells+=(product.get(i).getSell())*product.get(i).getQuantity();
			sellArr[i] = sells;
			
			profit = ((sells / costs)*100)-100;
			profitArr[i] = profit;
			
		}
		
		System.out.println("Total :"+sellArr[b-1]+" Profit of the product : "+profitArr[b-1]);
		
	}
	
	
	
}
