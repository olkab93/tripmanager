package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class TripManager {

    Collection<Trip> trips = new ArrayList<Trip>();

    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    public Collection<Trip> getTrips() {
        return trips;
    }

    public void removeTrip() {

    }

    public void findTrip() {

    }


}
