package classes;

public abstract class Train {

	abstract void engine();
}

class Compartments extends Train{

	@Override
	void engine() {
		System.out.println("It has more compartments");
		
	}
	
}

abstract class Seats{
	abstract void seat();
}
	
class Person extends Seats{

	@Override
	void seat() {
		System.out.println("A seat has a person");
		
	}
	
}
