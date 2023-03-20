package message;

public class Mail implements Communication {
	
	String from;
	String to;
	String subject;
	String message;
	
	
	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
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
