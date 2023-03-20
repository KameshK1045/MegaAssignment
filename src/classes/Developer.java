package classes;

public class Developer {

	public void work() {
		System.out.println("doing code, unit testing");
	}
}

class Technical extends Developer{
	public void techWork() {
		System.out.println("Managing developers, product architecture, and framework discussion");
	}
}
