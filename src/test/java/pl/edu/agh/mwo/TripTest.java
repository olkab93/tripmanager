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
    public void setNameTest() {
        trip.setName("Some Trip");
        assertTrue(trip.getName() == "Some Trip");
    }

    @Test
    public void setDescriptionTest() {
        trip.setDescription("Trip description");
        assertTrue(trip.getDescription() == "Trip description");
    }

	@Test
	public void addPhotoTest() {
		assertEquals(0, trip.getPhotos().size());
		trip.addPhoto(photo);
		assertEquals(1, trip.getPhotos().size());
	}

}
