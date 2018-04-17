package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class TripManager {

    ArrayList<Trip> trips = new ArrayList<Trip>();

    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    public ArrayList<Trip> getTrips() {
        return trips;
    }

    public void removeTrip(Trip trip) {
        trips.remove(trip);
    }

    public Trip findTrip(String tripKeyword) throws  NoSuchElementException {
        for (Trip trip : trips) {
            if (trip.name.equals(tripKeyword) || trip.description.equals(tripKeyword)) {
                return trip;
            }
        }
        throw new NoSuchElementException();
    }

}
