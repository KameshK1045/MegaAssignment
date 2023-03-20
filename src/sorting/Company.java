package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {

	String companyName;
	String productName;
	String country;
	String sellCountry;
	int revenue;
	String catogary;
	int rank;
	int rankInHunt;
	public List<Company>company = new ArrayList<Company>();
	
	public Company() {}
	Company(String companyName, String productName, String country, String sellCountry, int revenue,
			String catogary, int rank, int rankInHunt) {
		super();
		this.companyName = companyName;
		this.productName = productName;
		this.country = country;
		this.sellCountry = sellCountry;
		this.revenue = revenue;
		this.catogary = catogary;
		this.rank = rank;
		this.rankInHunt = rankInHunt;
	}
	
	public void companyList(int a) {
		
		company.add(new Company("Zoho","Zoho Writer","Dubai","Asia",98765,"Office Suite",1,2));
		company.add(new Company("Google","GWriter","Dubai","Asia",87658,"Office Suite",2,3));
		company.add(new Company("Zoho","Zshow","Los Angels","America",7654321,"Office Suite",1,1));
		company.add(new Company("Google","GSlides","Los Angels","America",678543,"Office Suite",4,4));
		company.add(new Company("Zoho","ZCliq","New york","America",778545,"Collabration",3,3));
		company.add(new Company("Slack","Slack","New york","America",767532,"Collabration",3,3));
		
		if(a==1) {Collections.sort(company,new comparables());}
		else if(a==2) {Collections.sort(company,new comps());}
		else if(a==3) {Collections.sort(company,new compss());}
		
		
		
		
	}
	
	public String toString() {
		return "Company Name : "+companyName+" Product Name : "+productName+" Country : "+country+" Selling Country : "+sellCountry+" Revenue : "+revenue+" Catogary : "+catogary+" Rank in app store : "+rank+" Ranking in product hunt : "+rankInHunt+"\n"; 
	}
	
	
}

class comparables implements Comparator<Company>{

	@Override
	public int compare(Company o1, Company o2) {
		// TODO Auto-generated method stub
		return o1.revenue-o2.revenue;
	}
	
	
	
}

class comps implements Comparator<Company>{

	@Override
	public int compare(Company o1, Company o2) {
		// TODO Auto-generated method stub
		return o1.rank-o2.rank;
	}
}

class compss implements Comparator<Company>{

	@Override
	public int compare(Company o1, Company o2) {
		// TODO Auto-generated method stub
		return o2.rankInHunt-o1.rankInHunt;
	}
	
}
