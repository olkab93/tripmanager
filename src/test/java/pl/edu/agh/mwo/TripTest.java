package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TripTest {
    private Trip trip;
    private Photo photo;

    @Before
    public void createDataForTripTest() {
        trip = new Trip();
        photo = new Photo();
    }

	@Test
	public void addPhoto() {
		assertEquals(0, trip.getPhotos().size());
		trip.addPhoto(photo);
		assertEquals(1, trip.getPhotos().size());
	}

}
