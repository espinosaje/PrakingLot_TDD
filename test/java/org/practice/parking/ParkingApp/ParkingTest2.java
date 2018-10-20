package org.practice.parking.ParkingApp;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ParkingTest2 {
	ArrayList<ParkingSpace> spaces;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		spaces= new ArrayList<ParkingSpace>();
    	spaces.add(new ParkingSpace(1,false));
    	spaces.add(new ParkingSpace(2,false));
    	spaces.add(new ParkingSpace(3,true));
    	spaces.add(new ParkingSpace(4,true));
    	spaces.add(new ParkingSpace(5,false));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testParkingLot() {	
		ParkingLot lot = new ParkingLot(spaces);
		assertNotNull(lot.getSpaces());
	}


	@Test
	public void testAvailableSpaces() {
		String message = "[number3, true, number4, true]";
    	ParkingLot lot = new ParkingLot(spaces);
    	assertEquals(message,lot.availableSpaces());
	}

}
