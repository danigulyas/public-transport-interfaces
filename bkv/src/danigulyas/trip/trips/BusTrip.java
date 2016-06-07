package danigulyas.trip.trips;

import danigulyas.route.Route;
import danigulyas.route.routes.BusRoute;
import danigulyas.station.stations.BusStation;
import danigulyas.trip.Trip;

public interface BusTrip extends Trip {
	BusRoute getRoute();
}
