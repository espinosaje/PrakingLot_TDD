package org.practice.parking.ParkingApp;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<ParkingSpace> spaces= new ArrayList<ParkingSpace>();
    	spaces.add(new ParkingSpace(1,false));
    	spaces.add(new ParkingSpace(2,false));
    	spaces.add(new ParkingSpace(3,true));
    	spaces.add(new ParkingSpace(4,true));
    	spaces.add(new ParkingSpace(5,false));
    	
    	ParkingLot ParkingLot = new ParkingLot(spaces);
    	
    	System.out.println("MAin: "+ParkingLot.availableSpaces());
    }
}
