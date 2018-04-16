package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;

public class TripManager {

    Collection<Trip> trips = new ArrayList<Trip>();

    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    public Collection<Trip> getTrips() {
        return trips;
    }

    public void removeTrip() {
        //TO DO
    }

    public Trip findTrip(String tripName) throws  NoSuchElementException {
        for (Trip trip : trips) {
            if (trip.getName().equals(tripName)) {
                return trip;
            }
        }
        throw new NoSuchElementException();
    }

}
