package org.practice.parking.ParkingApp;

public class ParkingSpace {
	
	int number;	//reflects distance from entrance
	boolean available;

	public ParkingSpace(int number, boolean available) {
		super();
		this.number = number;
		this.available = available;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	@Override
	public String toString(){
		return "number"+number+", "+available;
	}

}
