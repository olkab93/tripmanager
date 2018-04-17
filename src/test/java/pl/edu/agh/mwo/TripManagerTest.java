package pl.edu.agh.mwo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TripManagerTest {

	private TripManager tripManager;
	private Trip trip;
	private Trip another_tip;


	@Before
	public void createDataForTripManagerTests() {
		tripManager = new TripManager();
		trip = new Trip("Some trip", "Some trip description");
		another_tip = new Trip ("Another trip", "Another trip description");
	}
	
	@Test
	public void addTripTest() {
		assertEquals(0, tripManager.getTrips().size());
		tripManager.addTrip(trip);
		assertEquals(1, tripManager.getTrips().size());
	}
	
	@Test
	public void removeTripTest() {
        tripManager.addTrip(trip);
        assertEquals(1, tripManager.getTrips().size());
        tripManager.removeTrip(trip);
        assertEquals(0, tripManager.getTrips().size());

	}

	@Test
	public void findTripTest() {
		//assertEquals(trip.getName(), tripManager.findTrip("trip"));
	}


}
