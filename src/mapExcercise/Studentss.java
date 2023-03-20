package mapExcercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Studentss {

	String name;
	String group;
	String division;
	String section;
	List<Studentss> stud = new ArrayList<Studentss>();
	Map<Studentss,String> map = new HashMap<Studentss,String>();
	
	
	public Studentss() {}
	 Studentss(String name, String group, String division, String section) {
		super();
		this.name = name;
		this.group = group;
		this.division = division;
		this.section = section;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	
	public void studentDetails(String a) {
		stud.add(new Studentss("Aarthi","Computer Science","XII","A-1"));
		stud.add(new Studentss("Ananya","Biology","XII","B"));
		stud.add(new Studentss("Abinaya","Computer Science","XII","A2"));
		stud.add(new Studentss("Sri hari","Biology","XII","B"));
		stud.add(new Studentss("Anand","Commerce","XII","C"));
		
		for(int i=0; i<stud.size(); i++) {
			if(stud.get(i).getGroup().equals("Computer Science")) {
				map.put(stud.get(i),"Computer Science");
			}
			else if(stud.get(i).getGroup().equals("Biology")) {
				map.put(stud.get(i), "Biology");
			}
			else {
				map.put(stud.get(i), "Commerce");
			}
		}
		
		Set<Entry<Studentss,String>> set = map.entrySet();
		Iterator<Entry<Studentss,String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Entry<Studentss,String> key = itr.next();
			if(key.getValue().equals(a)) {
				System.out.println(key.getKey());
			}
		}
		
	}
	
	public String toString() {
		return "Student Name : "+name+" Group : "+group+" Class : "+division+" Section : "+section;
	}
	
	
}
