package org.practice.parking.ParkingApp;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ParkingLot {
	
	ArrayList<ParkingSpace> spaces;
	//ArrayList<ParkingSpace> fullSpaces;
	
	public ParkingLot(ArrayList<ParkingSpace> spaces) {
		super();
		this.spaces = spaces;
	}
	
	public ArrayList<ParkingSpace> getSpaces() {
		return spaces;
	}

	public void setSpaces(ArrayList<ParkingSpace> spaces) {
		this.spaces = spaces;
	}

	public String availableSpaces(){
		String result = "";
		
		//filter the ArrayList to only available spaces
		ArrayList<ParkingSpace> availableSpaces = spaces.stream().filter(s -> s.isAvailable()).collect(Collectors.toCollection(ArrayList::new));

		//availableSpaces.forEach(p -> System.out.println(p));	
		return availableSpaces.toString();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
