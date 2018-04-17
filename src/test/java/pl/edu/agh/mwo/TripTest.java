package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TripTest {
    private Trip trip;
    private Photo photo;

    @Before
    public void createDataForTripTest() {
        trip = new Trip("Some Trip", "Trip description");
        photo = new Photo("Photo from some trip");
    }

    @Test
    public void setNameTest() {
        trip.setName("Some Trip new name");
        assertTrue(trip.getName() == "Some Trip new name");
    }

    @Test
    public void setDescriptionTest() {
        trip.setDescription("Trip new description");
        assertTrue(trip.getDescription() == "Trip new description");
    }

	@Test
	public void addPhotoTest() {
		assertEquals(0, trip.getPhotos().size());
		trip.addPhoto(photo);
		assertEquals(1, trip.getPhotos().size());
	}

}
