package roombooking;

import megaass.MainClass;

public class Deluxe implements RoomBooking{


	String hotel;
	String type;



public String getHotel() {
	return hotel;
}

public void setHotel(String hotel) {
	this.hotel = hotel;
}


public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}


public void fetchNecessaryInputs() {
 
	System.out.println("Enter the hotel name");
	String hotel = MainClass.sc.nextLine();
	System.out.println("Enter the type\tSingleCot\tDoubleCot");
	String type = MainClass.sc.nextLine();
	
	setHotel(hotel);
	setType(type);
	
	fetchMatchingDetails();
	
}


public void fetchMatchingDetails() {

	if(getType().equals("SingleCot") || getType().equals("DoubleCot")) {
		bookAndLetKnows();
	}
	else {
		System.out.println("Enter valid choice");
		fetchNecessaryInputs();
	}
	
}


public void bookAndLetKnows() {
      System.out.println("Booked Succesfully,breakfast provided, coffee/Tea provided with extra charge, room service on request.");
}
}
