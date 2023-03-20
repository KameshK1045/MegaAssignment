package message;

public class Cliq implements Communication{
	
	String mail;
	String message;
	

	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public void fetchNecessaryInputs() {

		sendMessage();
	}


	public void sendMessage() {

		System.out.println("Your message is :"+getMessage());
		
	}

}
