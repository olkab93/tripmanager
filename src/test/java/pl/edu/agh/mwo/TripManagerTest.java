package pl.edu.agh.mwo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TripManagerTest {

	private TripManager tripManager;
	private Trip trip;


	@Before
	public void createDataForTripManagerTests() {
		tripManager = new TripManager();
		trip = new Trip();
	}
	
	@Test
	public void addTripTest() {
		assertEquals(0, tripManager.getTrips().size());
		tripManager.addTrip(trip);
		assertEquals(1, tripManager.getTrips().size());
	}
	
	@Test
	public void removeTripTest() {
		trip.setName("trip");
		assertEquals(trip.getName(); );
	}

	@Test
	public void findTripTest() {
		trip.setName("trip");
		assertEquals(trip.getName(), tripManager.findTrip("trip"));
	}


}
