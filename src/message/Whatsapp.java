package message;


public class Whatsapp implements Communication {
	
	String phoneNo;
	String message;
	

	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public void fetchNecessaryInputs() {
		String regex = "[0-9]{10}";
		if(getPhoneNo().matches(regex)) {
			sendMessage();
		}
	}

	
	public void sendMessage() {
		
		System.out.println("Your messsage : "+getMessage());
		
	}

}
