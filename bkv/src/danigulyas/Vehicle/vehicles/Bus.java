package danigulyas.vehicle.vehicles;

import danigulyas.route.Route;
import danigulyas.station.stations.BusStation;
import danigulyas.trip.Trip;
import danigulyas.trip.trips.BusTrip;
import danigulyas.vehicle.Vehicle;

public interface Bus extends Vehicle {
	Integer getNumberOfPassengers();
	BusTrip getTrip();
	public void startTrip(BusTrip trip);
}
