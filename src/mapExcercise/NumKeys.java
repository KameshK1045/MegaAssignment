package mapExcercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NumKeys {
	
	int dress =0;
	int food=0;
	int stat = 0;

	Map<Integer,String>map = new HashMap<Integer,String>();
	Map<String,Integer>alphaMap = new HashMap<String,Integer>();
	Map<String,String>detailMap = new HashMap<String,String>();
	public List<String>al = new ArrayList<String>();
	public List<String> al2 = new ArrayList<String>();
	Map <String,String> store = new HashMap<String,String>();
	
	public void detailsAdd(int key) {
		map.put(0, "Zero");
		map.put(1,"One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		
		Set<Entry<Integer, String>>sets = map.entrySet();
		Iterator<Entry<Integer, String>> itr = sets.iterator();
		
		while(itr.hasNext()) {
			Entry<Integer, String> keys = itr.next();
			if(key == keys.getKey()){
				System.out.println(keys.getValue());
			}
			
		}
		
	}
	
	public void alphaAdd(String b) {
		alphaMap.put("abc",2);
		alphaMap.put("def",3);
		alphaMap.put("ghi",4);
		alphaMap.put("jkl", 5);
		alphaMap.put("mno", 6);
		alphaMap.put("pqrs", 7);
		alphaMap.put("tuv",8);
		alphaMap.put("wxyz", 9);
		
		Set<Entry<String,Integer>>set1 = alphaMap.entrySet();
		Iterator<Entry<String,Integer>> itr1 = set1.iterator();
		
		while(itr1.hasNext()) {
			Entry<String,Integer>keys1 = itr1.next();
			if(keys1.getKey().equals(b)){
				System.out.println(keys1.getValue());
			}
		}
		
	}
	
	public void groupDetails() {
		detailMap.put("Afsana", "ZU sas");
		detailMap.put("Arun", "ZU sb");
		detailMap.put("Jaswanth", "ZU sas");
		detailMap.put("Karthikeyan", "ZU sas");
		detailMap.put("Shwetha", "ZU sas");
		detailMap.put("Akash", "ZU sb");
		detailMap.put("Rohit", "ZU sb");
		detailMap.put("Shri hari", "ZU sb");
		
		
		Set<Entry<String,String>> set2 = detailMap.entrySet();
		Iterator<Entry<String,String>> itr2 = set2.iterator();
		while(itr2.hasNext()){
			Entry<String,String>keys2 = itr2.next();
			if(keys2.getValue().equals("ZU sas")) {
				al.add(keys2.getKey());
			}
			else if(keys2.getValue().equals("ZU sb")){
				al2.add(keys2.getKey());
			}
		}
	}
	
	public void storeDetails(){
		store.put("T-shirts", "Dresses");
		store.put("Shirts", "Dresses");
		store.put("Chudidhars","Dresses");
		store.put("Saree", "Dresses");
		store.put("Pen", "Stationary");
		store.put("NoteBook", "Stationary");
		store.put("Pencil", "Stationary");
		store.put("Vegetables", "Food");
		store.put("Fruit", "Food");
		store.put("Bread", "Food");
		store.put("Rice", "Food");
		
		Set<Entry<String,String>> set3 = store.entrySet();
		Iterator<Entry<String,String>> itr3 = set3.iterator();
		while(itr3.hasNext()) {
			Entry<String,String>keys3 = itr3.next();
			if(keys3.getValue().equals("Dresses")) {
				dress+=1;
			}
			else if(keys3.getValue().equals("Food")) {
				food+=1;
			}
			else if(keys3.getValue().equals("Stationary")) {
				stat+=1;
			}
		}
		
		
		System.out.println("Dresses :"+dress);
		System.out.println("Stationary :"+stat);
		System.out.println("Food :"+food);
		
		
	}
}
