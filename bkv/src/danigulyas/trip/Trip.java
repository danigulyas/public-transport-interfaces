package danigulyas.trip;

import danigulyas.route.Route;
import danigulyas.station.Station;
import danigulyas.vehicle.vehicles.Bus;

public interface Trip {
	Route getStations();
}
