package classes;

import java.util.ArrayList;
import java.util.List;

public class Students {

	int id;
	String name;
	String classs;
	int english;
	int maths;
	int physics;
	int chemistry;
	List<Students>students=new ArrayList<Students>();
	
	public Students() {}
	Students(int id, String name, String classs, int english, int maths, int physics, int chemistry) {
		super();
		this.id = id;
		this.name = name;
		this.classs = classs;
		this.english = english;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClasss() {
		return classs;
	}
	public void setClasss(String classs) {
		this.classs = classs;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	
	
	public void studentsList(int a) {
		
		students.add(new Students(656321,"Aarthi","XII_A",76,56,67,78));
		students.add(new Students(530522,"Ananya","XII-A",95,59,51,87));
		students.add(new Students(817402,"Avinash","XII-B",63,60,79,80));
		students.add(new Students(5020202,"Balaji","XII-B",85,86,76,53));
		
		int total;
		int totalArr[] = new int [students.size()]; 
		for(int i=0; i<students.size(); i++) {
			total=0; 
			total+=students.get(i).getChemistry()+students.get(i).getEnglish()+students.get(i).getMaths()+students.get(i).getPhysics();
            totalArr[i] = total;
		}
		
		
			System.out.println("Name : "+students.get(a-1).getName()+" Total Marks :"+ totalArr[a-1]+" Percentage : "+(totalArr[a-1]/4)+" Result : "+"Pass");
		
	}
	
}
